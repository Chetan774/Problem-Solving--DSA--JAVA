package ARRAY;

import java.time.temporal.Temporal;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

public class Maximum_Subarray_Sum_Better
{
    public static int maxSubArray(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > 0) {
                arr[i] = arr[i] + arr[i - 1];
            }
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args)
    {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(arr);

        System.out.println(result);
    }
}
