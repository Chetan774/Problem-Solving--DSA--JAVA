package ARRAY;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Single_Element_In_Sorted_Array_Binary_Optimal
{
    public static int singleNonDuplicate(int[] arr)
    {
        int low = 0, high =  arr.length-1;

        int ans  = 0;

        int n = high;

        if(arr.length == 1 || arr[0] != arr[1] )
        {
            return arr[0];
        }

        if(arr[n] != arr[n-1])
        {
            return arr[n];
        }

        low = 1;
        high = n - 1;

        while(low <= high)
        {
            int mid  = ( low + high ) / 2;

            if(arr[mid] != arr[mid + 1] && arr[mid] != arr[mid -1])
            {
                return arr[mid];

            }

            if((mid % 2 == 1 && arr[mid -1]  == arr[mid]) ||
                    (mid % 2 == 0  && arr[mid] == arr[mid + 1]))
            {
            /* Means we are standing at the left half and it doesnt conatins the single
               element so eleminate left half by changing left half  */
                low  = mid + 1;
            }
            else // we are on the right half of element so shift to left
            {
                high = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1,1,2,3,3,4,4};

        int result  = singleNonDuplicate(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Silgle element : "+ result);

    }
}
