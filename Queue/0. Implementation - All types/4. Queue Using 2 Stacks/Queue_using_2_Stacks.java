package ARRAY;
import java.util.*;

public class Queue_using_2_Stacks
{
    public static class queue
    {
        static Stack<Integer> s1 = new Stack<>();

        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty()
        {
            if(s1.isEmpty())
            {
                System.out.println("Queue is Empty");
                return true;
            }

            return false;
        }

        public static void push(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }

        }


        public static int pop()
        {
            if(isEmpty())
            {
                System.out.println("Queue Is Empty Can not remove element ");
                return -1;
            }

            return s1.pop();

        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue Is empty");
                return -1;
            }


            return s1.peek();
        }
    }

    public static void main(String args[])
    {
        queue q = new queue();

        q.push(1);
        q.push(2);
        q.push(3);

        q.pop();
        q.push(4);

        q.pop();
        q.push(5);


        while(!q.isEmpty())
        {
            System.out.println(q.pop());

        }
    }
}
