package DSA_Implementation.Binary_Tree;
import java.util.*;

public class All_Types_Of_Transversal
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

    public static class BinaryTree
    {
        static int idx = -1;

        public static Node BuildTree(int node[])
        {
            idx++;

            if(idx >= node.length || node[idx] == -1)
            {
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = BuildTree(node);
            newNode.right = BuildTree(node);

            return newNode;

        }
    }

    public static void PreorderTraversal(Node root)
    {
        if(root == null)
        {
            return;
        }

        System.out.print(root.data+" ");
        PreorderTraversal(root.left);
        PreorderTraversal(root.right);

    }

    public static void InorderTraversal(Node root)
    {
        if(root == null)
        {

            return;
        }

        InorderTraversal(root.left);
        System.out.print(root.data+" ");
        InorderTraversal(root.right);

    }

    public static void PostOrderTraversal(Node root)
    {
         if(root == null)
         {
             return;
         }

         PostOrderTraversal(root.left);
         PostOrderTraversal(root.right);
         System.out.print(root.data+" ");
    }


    public static void LevelOrderTraversal(Node root)
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

    public static void main(String args[])
    {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,9};

        BinaryTree tree = new BinaryTree();

        Node root = tree.BuildTree(node);

        System.out.println("Preorder traversal : ");
        PreorderTraversal(root);

        System.out.println();

        System.out.println("Inorder Traversal : ");
        InorderTraversal(root);

        System.out.println();

        System.out.println("Postorder Traversal : ");
        PostOrderTraversal(root);

        System.out.println();

        System.out.println("Level Order traversal : ");
        LevelOrderTraversal(root);
    }
}
