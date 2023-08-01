package ARRAY;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Longest_Subarray_With_Sum_K_Better_Optimal_Negative
{
    public static int fun_Optimal_For_Negatives(int arr[], int k)
    {
        int sum = 0;
        int maxLength = 0;
        int c = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
                 sum += arr[i];

                 if(sum == k)
                 {
                     maxLength = Math.max(maxLength,i+1);
                     c++;
                 }

                 int rem = sum - k;

                 if(map.containsKey(rem))
                 {
                     int len = i - map.get(rem);
                     maxLength = Math.max(maxLength,len);
                     c++;
                 }

                 if (!(map.containsKey(sum)))
                 {
                     map.put(sum,i);
                 }
        }
        System.out.println("c : "+ c);
        return maxLength;
    }

    public static int  fun_Optimal_For_Psitives(int arr[],int k)
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
        int arr[] = {0,0,0,0,0,0,0,0,0,0};

        Scanner s = new Scanner(System.in);
        System.out.println("Input Array is : "+ Arrays.toString(arr));
        System.out.println("Enter K : ");
        int k = s.nextInt();
        int longest_subarray_Length = fun_Optimal_For_Negatives(arr,k);

        System.out.println("For Sum : "+ k);
        System.out.println("longest_subarray_Length  is : " + longest_subarray_Length);
    }
}
