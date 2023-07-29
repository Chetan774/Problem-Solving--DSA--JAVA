package ARRAY;

public class stack_Using_LinkedList {
    static public class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    static public class stack
    {
        static node head = null;

        public static boolean isEmpty()
        {
            return head == null;
        }

        public void push(int data)
        {
            node newNode = new node(data);

            if(isEmpty())
            {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop()
        {
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek()
        {
            return head.data;
        }


    }

    public static void main(String[] args)
    {
        stack s = new stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!(s.isEmpty()))
        {
            System.out.print(s.pop()+ " ");
        }

    }
}
