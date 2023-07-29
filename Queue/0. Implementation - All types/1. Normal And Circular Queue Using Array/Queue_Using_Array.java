package ARRAY.Easy;
import java.sql.Struct;
import java.util.*;

public class Queue_Using_Array
{
    public  static  class  queue

    {
        static int arr[];
        static int rear;
        static int size;

        queue( int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty()
        {
            if(rear == -1)
            {
                return true;
            }
            return false;
        }

        public static  void add(int data)
        {
            if(rear  == size -1)
            {
                System.out.println("Queue is Full Cant add");
                return;
            }

            rear = rear +1;
            arr[rear] = data;
        }

        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }

            int front  = arr[0];

            for(int i = 0; i < arr.length-1; i++)
            {
                arr[i] = arr[i+1];
            }

            rear = rear - 1;

            return  front;

        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return  -1;
            }

            int fornt  = arr[0];

            return fornt;
        }


    }

    public static void main(String[] args)
    {
           queue q = new queue(5);
           q.add(1);
           q.add(2);
           q.add(3);
           q.add(4);
           q.add(5);

           while(!q.isEmpty())
           {
               System.out.print(q.peek()+" ");
               q.remove();
           }
        System.out.println();
           

    }
}
