package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Left_Rotate_Array_By_K_Places
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7};

        System.out.println("Input "+ Arrays.toString(arr));

        System.out.println("To do any no of rotations make k = k % array.length\n" +
                "        \nEnter K : ");

        // To do any no of rotations make k = k % array.length




        Scanner s = new Scanner(System.in);
        int k = s.nextInt();

        k = k % arr.length;

        int temp[] = new int[k];

        for (int i = 0; i < k; i++)
        {
             temp[i] = arr[i];
        }



        for (int i = k, counter = 0; i < arr.length ; i++,counter++)
        {
            arr[counter] = arr[i];

        }

        for (int i = arr.length-k,c = 0; i < arr.length; i++,c++)
        {
            arr[i] = temp[c];

        }

        System.out.println(Arrays.toString(arr));
    }
}
