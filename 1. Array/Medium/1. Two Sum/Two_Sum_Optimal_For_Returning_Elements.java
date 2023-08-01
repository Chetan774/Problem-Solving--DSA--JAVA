package ARRAY;

import java.util.Arrays;

public class Two_Sum_Optimal_For_Returning_Elements
{
//    Time complexity : O(N) (Iterating over array )+ O(N * Log(N))(Sorting Array);

    public static int[] fun(int arr[], int target)
    {
        int left = 0;
        int right = arr.length-1;

        for (int i = 0; i < arr.length; i++)
        {
            int sum = arr[left] + arr[right];

            if(sum == target)
            {
                int result[] = {arr[left],arr[right]};
                return result;
            }
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }

        int r_null[] = {0,0};
        return  r_null;
    }

    public static void main(String[] args)
    {
        int arr[] = {6,2,5,8,11};

        Arrays.sort(arr); //Time : O(N * log(N)

        int result[] = fun(arr,14);
        System.out.println(Arrays.toString(result));
    }
}
