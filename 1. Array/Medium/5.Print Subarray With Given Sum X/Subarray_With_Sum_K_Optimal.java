package ARRAY.Medium;

import java.util.Arrays;

public class Subarray_With_Sum_K_Optimal
{
    public static void func(int arr[], int k)
    {
        int start = 0,end = 0;

        int sum = 0;

        int n =arr.length;

        while(start < arr.length)
        {
            while((end < n ) && (sum+ arr[end]) <= k  )
            {
                sum  = sum + arr[end];
                end++;
            }

            if(sum == k)
            {
                for (int i = start; i < end; i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }

            sum = sum - arr[start];
            start++;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("This Approach Prints All subarrays Exist in a given Array with sum K ");
        int arr[] = {1,3,7,9};
        System.out.println("Input Array : " + Arrays.toString(arr));
        func(arr,10);
    }
}
