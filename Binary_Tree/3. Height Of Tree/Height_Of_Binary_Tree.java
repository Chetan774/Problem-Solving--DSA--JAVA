package DSA_Implementation.Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Height_Of_Binary_Tree
{
    public static class Node
    {
        int data;
        Node left;
        Node right;


        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public  static class BinaryTree2
    {
        static int idx = -1;

        public static Node BuildPreorderTree(int node[])
        {
            idx++;

            if(idx >= node.length || node[idx] == -1)
            {
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = BuildPreorderTree(node);
            newNode.right = BuildPreorderTree(node);

            return newNode;

        }
    }

    public static void LeverOrderTraversal(Node root)
    {
        if(root == null)
        {
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node currNode = q.remove();

            if(currNode == null)
            {
                System.out.println();

                if(!q.isEmpty())
                {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(currNode.data+" ");
                if(currNode.left != null)
                {
                    q.add(currNode.left);
                }

                if(currNode.right != null)
                {
                    q.add(currNode.right);
                }
            }
        }


    }
    public static int  HeightOfTree(Node  root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftHeight = HeightOfTree(root.left);
        int rightHeeight = HeightOfTree(root.right);

        return Math.max(leftHeight, rightHeeight)+1;
    }

    public static void main(String Args[])
    {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,9,-1,10};

        BinaryTree2 tree = new BinaryTree2();
         Node root = tree.BuildPreorderTree(node);

        LeverOrderTraversal(root);
        System.out.println();
        System.out.println();

        System.out.println(HeightOfTree(root));

    }
}
