package ARRAY.Easy;
import java.util.*;

public class Queue_Using_Deque
{
    public static class Queue
    {
        static Deque<Integer> deque = new LinkedList<>();

        public static boolean isEmpty()
        {
            if(deque.isEmpty())
            {
                return true;
            }

            return false;
        }

        public static void add(int data)
        {
            deque.addLast(data);
        }

        public static int remove()
        {
            return deque.removeFirst();
        }

        public static int peek()
        {
            return deque.getFirst();
        }
    }

    public static void main(String arg[])
    {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        q.remove();
        q.add(4);

        while(!q.isEmpty())
        {
            System.out.print(q.remove()+" ");
        }
    }
}
