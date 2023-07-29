package DSA_Implementation;

public class Build_Preorder_Tree
{
     static class Node
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

     static class BinaryTree
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

    public static void main(String args[])
    {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,9};

        BinaryTree tree = new BinaryTree();

        Node root = tree.BuildTree(node);

        System.out.println(root.data);
    }
}
