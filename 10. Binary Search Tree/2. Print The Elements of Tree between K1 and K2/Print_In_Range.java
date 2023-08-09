public class Print_In_Range
{
    public static class node
    {
        int data ;
        node left;
        node right;

        node(int data)
        {
            this.data = data;
        }
    }

    public static node Insert(node root, int val)
    {
        if(root == null)
        {
            root = new node(val);
            return root;
        }

        if(root.data > val)
        {
            root.left = Insert(root.left, val);
        }
        else
        {
            root.right = Insert(root.right, val);
        }

        return root;
    }

    public static void inorder(node root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void printInRange(node root, int k1, int k2)
    {
        if(root  == null)
        {
            return;
        }

        if(root.data >= k1 && root.data <= k2)
        {
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1,k2);
        }
        else if(root.data < k1)
        {
            printInRange(root.left, k1, k2);
        }
        else
        {
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args)
    {
        int values[] = {5,3,4,1,6,7};

        node root = null;

        for(int i = 0; i < values.length; i++)
        {
             root = Insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        printInRange(root, 1, 5);
    }
}
