package ARRAY.Easy;

public class Queue_Using_LinkedList
{

    public static class Node
    {
           int data;
           Node next ;

          Node(int data)
          {
              this.data = data;
              this.next  = null;
          }
    }

    public static class queue
    {
        static  Node front = null;
        static Node rear = null;

        public static boolean isEmpty()
        {
            if(front == null && rear == null)
            {
                return true;
            }
            return false;
        }


        public static void add(int data)
        {
            Node newNode = new Node(data);

            if(front == null )
            {
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }


        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            int data = front.data;

            if(front == rear)
            {
                front = rear = null;
            }
            else
            {
                front = front.next;
            }


            return data;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }

            return front.data;
        }
    }

    public static void main(String args[])
    {
        queue q  = new queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
