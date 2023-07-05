package ARRAY;

import java.util.Arrays;

public class Find_Missing_No_Optimal
{
      //optimal Approach Using Sum Method
    // sum of n Numbers : n(n+1)/2
    // Time O(n) Space : O(1)

    public static void main(String[] args)
    {
        int arr[] = {0,1,2,3,5};

        int n = arr.length;

        int sum = (n * (n+1))/2;

        int sum2 = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum2 = sum2 + arr[i];
        }

        int missing_No = sum - sum2;

        System.out.println("Input Array : "+ Arrays.toString(arr));
        System.out.println("missing No is :  "+ missing_No);
        System.out.println("Time : O(n)"+" \n" +"Space : O(1)");
    }


}
