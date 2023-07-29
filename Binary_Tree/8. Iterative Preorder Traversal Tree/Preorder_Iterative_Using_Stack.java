package Binary_Tree;
import java.util.*;
public class Preorder_Iterative_Using_Stack
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

    public static ArrayList<Integer> Iterative_Preorder(node root)
    {
        ArrayList<Integer> list  = new ArrayList<>();
        Stack<node> st = new Stack<>();

        st.push(root);

        while(!st.isEmpty())
        {
            node curr = st.pop();
            if(curr != null)
            {
                list.add(curr.data);
            }

            if(curr.right != null)
            {
                st.push(curr.right);
            }

            if(curr.left != null)
            {
                st.push(curr.left);
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

        ArrayList<Integer> list = Iterative_Preorder(root);

        System.out.println(list);


    }
}
