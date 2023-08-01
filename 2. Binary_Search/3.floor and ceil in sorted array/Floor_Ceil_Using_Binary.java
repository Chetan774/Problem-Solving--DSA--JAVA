package ARRAY;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Floor_Ceil_Using_Binary
{

    public static int[] floorAndCeil(int arr[], int x)
    {
        int low = 0;
        int high = arr.length-1;
        int ceil = -1;
        int floor = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if( arr[mid] <= x )
            {
                 floor = arr[mid];
                low = mid + 1;
            }
            else
            {
                high = mid-1;
            }
        }

         low = 0;
         high = arr.length-1;

        while(low <=  high)
        {
           int mid = ( low + high ) / 2;

            if( arr[mid] >= x )
            {
                ceil = arr[mid];
                high = mid - 1;
            }
            else
            {
                low = mid+1;
            }

        }



        return new int[]{floor, ceil};
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,4,7,8}; int x = 5;
        int arr2[] = {1,2,3,4,8,9};  int x2 = 8;


        int result[] = floorAndCeil(arr,x);
        System.out.println(Arrays.toString(arr));
        System.out.println("The floor and ceil of : " + x+ " is : ");

        System.out.println("Floor : "+ result[0]);
        System.out.println("Ceil : "+ result[1]);
        System.out.println(Arrays.toString(result));
    }
}
