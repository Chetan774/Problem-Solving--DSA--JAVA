package ARRAY;
import java.util.*;
public class Interleaving_Two_Halfs_Of_Queue
{
        public static Queue<Integer>  Interleaving(Queue<Integer> q)
        {
            Queue<Integer> first = new LinkedList<>();


            int size = q.size();
            for (int i = 0; i <size/2; i++)
            {
                  first.add(q.remove());
            }

//            System.out.println(first);

            while(!first.isEmpty())
            {
                q.add(first.remove());
                q.add(q.remove());
            }


            return q;
        }

    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5); q.add(6);
        q.add(7); q.add(8); q.add(9); q.add(10);

        System.out.println("Input : "+ q);
        Queue<Integer> ans =  Interleaving(q);
        System.out.println(ans);
    }
}
