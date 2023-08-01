package ARRAY.Medium;

import java.util.Arrays;

public class Subarray_With_Sum_K_Better
{

    public static void func(int arr[], int k)
    {
        int i = 0,j = 0;

        int sum = 0;

        while(j < arr.length)
        {

            if(sum < 10)
            {
                sum += arr[j];
                j++;
            }
            else if(sum == k)
            {
                for (int l = i; l < j; l++)
                {
                    System.out.print(arr[l]+ " ");
                }
                System.out.println();
                i++;
                j = i;
                sum = 0;
//                return;
            }
            else if(sum > 10)
            {
                i++;
                j = i;
                sum = 0;
            }

        }
    }

    public static void main(String[] args)
    {
        System.out.println("This Approach is used to print only one subarray with given sum ");
          int arr[] = {2,1,3,4,5,6};
        System.out.println("Input Array : " + Arrays.toString(arr));
          func(arr,10);
    }
}
