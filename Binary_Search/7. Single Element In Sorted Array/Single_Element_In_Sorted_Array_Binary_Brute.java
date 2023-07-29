package ARRAY;

import java.util.Arrays;

public class Single_Element_In_Sorted_Array_Binary_Brute
{
    public static int singleNonDuplicate(int[] arr)
    {
        int low = 0, high =  arr.length-1;

        int ans  = 0;

        while(low <= high)
        {
            int mid  = ( low + high ) / 2;

            if(!(arr[mid + 1] == arr[mid] || arr[mid - 1] == arr[mid]))
            {
                return arr[mid];
            }

            if(arr[mid] == arr[mid + 1])
            {
                mid = mid + 1;
            }


            if((mid + 1) % 2 != 0)
            {
                high = mid;
            }
            else
            {
                low = mid + 1;
            }

        }

        return 0;
    }
    public static void main(String[] args) {

        int arr[] = {1,1,2,3,3,4,4};

        int ans  = singleNonDuplicate(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);

    }
}
