package OOP_In_Java;
import java.util.*;

public class PriorityQueue_For_Objects
{
     static class student implements Comparable<student>
     {

        String name;
        int rank;

        student(String name, int rank)
        {
            this.name = name;
            this.rank = rank;
        }



         @Override
         public int compareTo(student s1) {
             return this.rank  - s1.rank;
         }
     }

    public static void main(String[] args)
    {
        PriorityQueue<student>  pq = new PriorityQueue<>();

        pq.add(new student("Cheatan", 10));
        pq.add(new student("Omkar ", 1));
        pq.add(new student("Vinay ", 7));
        pq.add(new student("Girish ", 2));
        pq.add(new student("Dheeraj ", 6));



        while(!pq.isEmpty())
        {
            System.out.println("Name : "+ pq.peek().name + "  "+ "Rank : "+ pq.peek().rank);
            pq.remove();
        }


    }
}
