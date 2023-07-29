package ARRAY.Easy;
import java.util.*;

public class Queue_Using_Collections
{
    //Queue is a Interface so we can not implement queue directly we can use
    // Linkedlist and ArrayDequqe  framework to implement queue


    public static void main(String[] args) {



//        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        q.remove(1);
        q.add(4);

        q.remove(2);
        q.add(5);

                System.out.println(q);

                while(!q.isEmpty())
                {
                    System.out.println(q.peek());
                    q.remove();
                }
    }
}

