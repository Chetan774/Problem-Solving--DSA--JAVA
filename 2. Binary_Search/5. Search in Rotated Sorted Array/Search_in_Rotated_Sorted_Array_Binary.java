package ARRAY;

import java.util.Arrays;

public class Search_in_Rotated_Sorted_Array_Binary
{

    public static int search_Rotated_Array_binary(int arr[], int x)
    {
        int low = 0, high = arr.length -1;

        while ((low <= high))
        {
            int mid = (low + high ) / 2;

            if(arr[mid] == x)
            {
                return mid;
            }

            if(arr[low] <= arr[mid])
            {
                if(arr[low] <= x && x <= arr[mid])
                {
                    high = mid -1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else
            {
                if(arr[mid] <= x && x <= arr[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int arr[] = { 3, 3, 0,3};
        int x   =  3;

        int result = search_Rotated_Array_binary(arr,x);

        System.out.println(Arrays.toString(arr));
        System.out.println("Search : "+ x);
        System.out.println(result);
    }
}
