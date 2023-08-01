package Binary_Tree;
import java.util.*;
import java.util.ArrayList;

public class Iterative_Inorder_Using_Stack
{
    public  static class node
    {
        int data;
        node left;
        node right;

        node(int data)
        {
            this.data = data;
            this.left =  null;
            this.right  = null;
        }
    }

    public static ArrayList<Integer> Iterative_Inorder_Traversal(node root)
    {
        if(root == null)
        {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();

        Stack<node> s = new Stack<>();



        while(true)
        {

           if(root != null)
            {
                s.push(root);
                root = root.left;
            }
            else
            {
                if(s.isEmpty())
                {
                    break;
                }
                root = s.pop();
                list.add(root.data);
                root = root.right;

            }
        }
        return list;

    }
    public static void main(String[] args)
    {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.right = new node(6);

        ArrayList<Integer> list = Iterative_Inorder_Traversal(root);

        System.out.println(list);


    }
}
