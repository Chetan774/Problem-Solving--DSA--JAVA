import java.util.*;

public class MinCostToCombineRopes
{  


    public static int MinCost(PriorityQueue<Integer> pq)
     {
           int sum = 0;
          
          while( pq.size()> 1)
          {

            int first = pq.remove();
            int second = pq.remove();

            sum += ( first + second );

            pq.add( first + second );

          }

         return sum;
     }
   
    public static void main(String args[])
    {
         int ropes[] = {2,3,3,4,6};  
 

         PriorityQueue<Integer> pq = new PriorityQueue<>();
         
          for(int i = 0; i < ropes.length; i++)
            {
              pq.add(ropes[i]);
            }
        
  

        int Minimum_Cost  = MinCost(pq);
        
  System.out.println("Minimum Cost To Combine Ropes is : "+ Minimum_Cost);

     }
}
           