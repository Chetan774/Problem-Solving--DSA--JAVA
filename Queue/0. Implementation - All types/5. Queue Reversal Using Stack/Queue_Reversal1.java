package ARRAY;
import java.util.*;
public class Queue_Reversal1
{
    public static Queue<Integer> reversal(Queue<Integer> q)
    {

        Stack<Integer> s = new Stack<>();



        while(!q.isEmpty())
        {
            s.push(q.remove());
        }

        while(!s.isEmpty())
        {
            q.add(s.pop());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("Input Queue : "+ q);

        Queue<Integer> ans = reversal(q);

        System.out.println(ans);
    }
}
