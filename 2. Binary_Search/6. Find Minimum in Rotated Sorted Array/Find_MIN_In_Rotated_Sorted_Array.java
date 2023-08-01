package ARRAY;

import java.util.Arrays;

public class Find_MIN_In_Rotated_Sorted_Array
{
    public static int findMin(int[] arr)
    {
        if (arr.length  == 1)
        {
            return arr[0];
        }
        int low = 0;
        int high = arr.length-1;

        int min  = Integer.MAX_VALUE;

        while(low <= high)
        {
            int mid = ( low + high ) / 2;

            if(arr[mid] >= arr[low])
            {
                min = Math.min(min,arr[low]);
                low = mid + 1;
            }
            else
            {
                min = Math.min(min,arr[mid]);
                high = mid - 1;
            }

        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = { 2,1};

        int result = findMin(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("MIN : "+ result);
    }
}
