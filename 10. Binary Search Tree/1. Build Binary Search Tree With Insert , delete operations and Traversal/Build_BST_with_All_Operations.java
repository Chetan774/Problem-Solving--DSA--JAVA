public class Build_BST_with_All_Operations
{
    public static class node
    {
        int data;
        node left;
        node right;

        node(int data)
        {
            this.data = data;
        }

    }

    public static node insert(node root, int val)
    {
        if(root == null)
        {
            root = new node(val);
            return root;
        }

        if(root.data > val)
        { //insert to left
            root.left = insert(root.left, val);
        }
        else
        {//insert to right
            root.right = insert(root.right, val);
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
        System.out.print(root.data +" ");
        inorder(root.right);
    }

   public static node findInorderSuccessor(node root)
   {
       if(root.left != null)
       {
           root = root.left;
       }

       return root;
   }

   public static node delete (node root,int val)
   {
       if(root.data > val)
       {
           root.left = delete(root.left, val);
       }
       else if(root.data < val)
       {
           root.right = delete(root.right, val);
       }
       else
       {
           //Case 1 : val  = root.data

           if(root.left == null && root.right == null)
           {
               return null;
           }

           //case- 2 : 1 child
           if(root.left == null)
           {
               return root.right;
           }
           if(root.right == null)
           {
               return root.left;
           }

           //case 3 : 2 child

           node is = findInorderSuccessor(root.right);
           root.data = is.data;
           root.right = delete(root.right, is.data);

       }

       return root;
   }

    public static void main(String args[])
    {
        int values[] = {5,1,3,4,2,7};


        node root = null;

        for(int i = 0; i < values.length; i++)
        {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
        delete(root, 5);

        inorder(root);



    }
}
