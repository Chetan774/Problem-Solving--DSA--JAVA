package ARRAY.Medium;

import java.util.Arrays;

public class Optimal_O_N
{

    //Time : O(N)+O(N/2)
    //Space : O(N)

    public static int[] rearrangeArray(int arr[])
    {
        int even = 0;
        int odd = 1;


        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 0)
            {
                ans[even] = arr[i];
                even += 2;
            }
            else
            {
                ans[odd] = arr[i];
                odd += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        int arr[] = {-1,3,-5,7};

        int result[] = rearrangeArray(arr);

        System.out.println(Arrays.toString(result));
    }
}
