package ARRAY;

import java.util.Arrays;

public class Peak_Element_In_Array
{
    public static int findPeakElement(int[] arr)
    {
        int low=  0, high = arr.length-1;

        int n = arr.length - 1;

        if(arr.length  == 1 || (arr[0] > arr[1]))
        {
            return 0;
        }

        if(arr[n] > arr[n-1])
        {
            return n;
        }

        while(low <= high)
        {
            int mid  = (low + high ) /  2;

            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
            {
                return arr[mid];
            }

            if(arr[mid] < arr[mid + 1])
            {
                low  = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        return -1;

    }
    public static void main(String[] args) {

        int arr[] = {1,1,2,3,8,4,4};

        int result  = findPeakElement(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Peak element : "+ result);

    }
}
