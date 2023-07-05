package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Right_Rotate_Array_By_K_Places_Better
{
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,6};

        System.out.println("Initial array : "+Arrays.toString(arr));

        Scanner s  = new Scanner(System.in);
        int k =  s.nextInt();
        int temp[] = new int[k];

        for (int i = arr.length - k; i < arr.length; i++)
        {
            temp[i - (arr.length-k)] = arr[i];
        }

        System.out.println("temp : "+Arrays.toString(temp));

        for (int i = arr.length-1; i >= k ; i--)
        {
            arr[i] = arr[i-k];
            System.out.println(i-k);
        }

        System.out.println("temp : "+Arrays.toString(temp));

        for (int i = 0; i < temp.length; i++)
        {
            arr[i] = temp[i];
            System.out.println(temp[i]);
        }

        System.out.println("temp : "+Arrays.toString(arr));

    }
}
