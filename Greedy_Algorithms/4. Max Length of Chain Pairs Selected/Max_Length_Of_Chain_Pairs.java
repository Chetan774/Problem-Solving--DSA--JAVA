package ARRAY;
import java.util.*;

public class Max_Length_Of_Chain_Pairs
{
    //Condition : the start time of 2nd pair should be greater than end time of last pair


    public static void main(String[] Args)
    {
        int[][] pair = {{1,2},{3,6},{4,9},{8,17},{10,49},{20,40}};

        System.out.println("Input Pairs : ");
        for(int[] row : pair)
        {
            System.out.print(Arrays.toString(row)+  " ");
        }
        // ans  = 4

        Arrays.sort(pair,Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;    //first activity already selected

        int ChainEnd = pair[0][1];

        for(int i = 1; i < pair.length; i++)
        {
            if(pair[i][0] > ChainEnd)
            {

                chainLength++;
                ChainEnd = pair[i][1];
            }
        }

        System.out.println();
//        System.out.println("Index of Pairs Selected "+ list);

        System.out.println("Max Chain length: "+ chainLength);


    }
}
