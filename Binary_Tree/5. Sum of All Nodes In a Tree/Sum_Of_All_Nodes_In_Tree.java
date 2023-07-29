package DSA_Implementation.Binary_Tree;

public class Sum_Of_All_Nodes_In_Tree
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
    public static void PreorderTraversal(Node root)
    {
        if(root == null)
        {
            return;
        }

        PreorderTraversal(root.left);
        System.out.print(root.data+" ");
        PreorderTraversal(root.right);
    }

    public static int SumOfNodes(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int lc =  SumOfNodes(root.left);
        int rc = SumOfNodes(root.right);

        return lc + rc + root.data;
    }

    public static void main(String args[])
    {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left  = new Node(4);
        root.right.right = new Node(5);


        PreorderTraversal(root);

        int totalNodes = SumOfNodes(root);
        System.out.println("Sum of all  Nodes In tree : "+ totalNodes);

    }
}
