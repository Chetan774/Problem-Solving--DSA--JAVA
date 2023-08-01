package ARRAY;

import java.util.Arrays;

public class Optimal_Solution_O_N
{
    public static void main(String[] args)
    {

          /*Optimal Solution
        Two pointer Approach
        Time complexity  = O(N)
        Space Complexity : O(1)*/

        System.out.println(";Optimal Solution\n" +
                "        Two pointer Approach\n" +
                "        Time complexity  = O(N)\n" +
                "        Space Complexity : O(1)*\n\n\n");



        int arr[] = {1,2,2,3,3,2,2};

        System.out.println("Before " + Arrays.toString(arr));

        int i = 0;

        int count  = 0;

        int j = 1;

        while(j < arr.length)
        {
            if(arr[i] != arr[j])
            {
                i = i+1;

                arr[i] = arr[j];

            }

            j++;
        }

        System.out.println("After : " +Arrays.toString(arr));
        System.out.println("Total Element Without Duplicates : "+ (i));
    }
}
