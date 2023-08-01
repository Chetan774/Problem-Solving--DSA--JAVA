package OOP_In_Java;
import  java.util.PriorityQueue;

public class Priority_Queue_Implementation
{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(4); // (O(logN))
        pq.add(1);
        pq.add(3);
        pq.add(7);
        System.out.println("By default Min Heap Is Used To sort");

        System.out.println(pq);

        while(!pq.isEmpty())
        {
            System.out.print(pq.peek()+" ");
            pq.remove();
        }

    }
}
