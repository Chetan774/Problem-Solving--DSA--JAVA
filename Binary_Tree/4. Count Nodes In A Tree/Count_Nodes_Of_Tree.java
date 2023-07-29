import java.util.function.Predicate;

public class Count_Nodes_Of_Tree
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

    public static int CountNode(Node root)
    {
          if(root == null)
          {
              return 0;
          }

         int lc =  CountNode(root.left);
          int rc = CountNode(root.right);

          return lc + rc + 1;
    }

    public static void main(String args[])
    {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left  = new Node(4);
        root.right.right = new Node(5);


        PreorderTraversal(root);

        int totalNodes = CountNode(root);
        System.out.println("Total Nodes In tree : "+ totalNodes);





    }
}
