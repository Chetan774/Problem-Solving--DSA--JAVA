package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Longest_Subarray_With_Sum_K_Optimal_For_Positives
{
    public static int  fun_Optimal_For_Positives(int arr[],int k)
    {
        int left = 0;
        int right = 0;
        int sum = arr[0];


        int max_Length = 0;

        int n = arr.length;
        while (right < n)
        {
            while (left <= right && sum > k)
            {
                sum = sum -arr[left];
                left++;
            }

            if(sum == k)
            {
                max_Length = Math.max(max_Length,right-left+1);
            }

            right++;

            if(right < n)
            {
                sum = sum + arr[right];
            }

        }

        return max_Length;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,1,1,1,4,2,3};

        Scanner s = new Scanner(System.in);
        System.out.println("Input Array is : "+ Arrays.toString(arr));
        System.out.println("Enter K : ");
        int k = s.nextInt();
        int longest_subarray_Length = fun_Optimal_For_Positives(arr,k);

        System.out.println("For Sum : "+ k);
        System.out.println("longest_subarray_Length  is : " + longest_subarray_Length);
    }
}
