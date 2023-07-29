package ARRAY;

import java.util.*;


public class Fractional_Knapsack_Unsorted
{
    public static void main(String[] args)
    {
        int value[] = {120,60,100};
        int weight[] = {30,10,20};

        int capacity = 50;

        double ratio[][] = new double[value.length][2];

        for(int i = 0; i < value.length; i++)
        {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int totalValue = 0;

        for(int i = ratio.length-1; i >= 0; i-- )
        {
            int idx = (int)ratio[i][0];

            if(capacity >= weight[idx])
            {
                totalValue += value[idx];
                capacity -= weight[idx];
            }
            else
            {
                totalValue += (capacity * ratio[i][1]);
                capacity = 0;
                break;
            }

        }

        System.out.println("Total value : "+ totalValue);




    }
}
