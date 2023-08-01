package ARRAY;

import java.util.Arrays;

public class move_0_to_End_BruteForce
{
    public static void main(String[] args)
    {

        /* step - 1 - extra array is created to store the non zero elements
          step -2 - the extra array is copied to the start of array
          step -3 - remaing array is filled with zeros(0)
         */

        int arr[]  = {1,2,0,3,4,0,5,6};


        int count  = 0;

        for (int i = 0; i < arr.length; i++) {
             if(arr[i] == 0)
             {
                 count++;
             }
        }

        int j = 0;

        int temp[] = new int[arr.length-count];

        for (int i = 0; i < arr.length-count; i++)
        {
            if(arr[i] != 0)
            {
                temp[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < arr.length-count; i++)
        {
            arr[i] = temp[i];
        }

        for (int i = arr.length-count; i < arr.length; i++)
        {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
