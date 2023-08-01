package ARRAY.Easy;
import java.sql.SQLOutput;
import java.util.*;
public class CircularQueue_Using_Array
{
    //In circular  every operation needs o(1) time




    public static class queue
    {
        static int arr[];
        static int rear;
        static int front;
        static int size;

        queue(int n)
        {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty()
        {
            if(front == -1 && rear == -1)
            {
                return true;
            }
            return false;
        }

        public static boolean isFull()
        {
            if((rear+1) % size == front)
            {
                return true;
            }
            return false;
        }

        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("queue is full");
                return;
            }

            rear = (rear+1) % size;


            if(front == -1)
            {
                front = 0;
            }

            arr[rear] = data;
        }


        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }

            int result  = arr[front];

            if(front == rear)
            {
                front =-1;
                rear = -1;
            }
            else
            {
                front = (front + 1) % size;
            }

            return result;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }


    }

    public static void main(String args[])
    {

        System.out.println("In circular  every operation needs o(1) time ");


        queue q = new queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        //removing one element
        q.remove();

//        adding one element
        q.add(4);

        q.remove();
        q.add(5);

        System.out.println("After Removing 1 and 2 and adding 4 and 5");

        while(!q.isEmpty())
        {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
