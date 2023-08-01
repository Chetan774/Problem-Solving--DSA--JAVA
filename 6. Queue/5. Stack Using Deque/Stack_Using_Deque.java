package ARRAY.Easy;
import java.util.*;

public class Stack_Using_Deque
{
    public static class Stack
    {
        static Deque<Integer> deque  = new LinkedList<>();


        public static boolean isEmpty()
        {
            if(deque.isEmpty())
            {
                return true;
            }
            return false;
        }
        public static void push(int data)
        {
            deque.addFirst(data);
        }

        public static int pop()
        {
            if(deque.isEmpty())
            {
                return -1;
            }
            return deque.removeFirst();
        }

        public static int peek()
        {
            if(deque.isEmpty())
            {
                return -1;
            }
            return deque.getFirst();
        }
    }


    public static void main(String[] args) {
        Stack s  = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.push(4);

        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }

    }
}
