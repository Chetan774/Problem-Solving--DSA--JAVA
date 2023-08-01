package Binary_Tree;

import java.util.ArrayList;
import java.util.*;

public class Iterative_PostOrder_Using_Two_Stacks
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

    public static ArrayList<Integer> Iterative_PostOrder(node root)
    {
        if(root == null)
        {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();

        Stack<node> s1 = new Stack<>();
        Stack<node> s2 = new Stack<>();

        s1.push(root);


        while(!s1.isEmpty())
        {
            node curr = s1.pop();

            s2.push(curr);

            if(curr.left != null)
            {
                s1.push(curr.left);
            }
            if(curr.right != null)
            {
                s1.push(curr.right);
            }

        }


        while(!s2.isEmpty())
        {
            node curr2 = s2.pop();
            list.add(curr2.data);
        }
        return list;
    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.right = new node(6);


        ArrayList<Integer> list = Iterative_PostOrder(root);

        System.out.println(list);

    }
}
