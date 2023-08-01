package ARRAY;

import java.util.Arrays;

public class Single_No_In_Array
{
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4,5,5};

        int xor = 0;

        for (int i = 0; i < arr.length ; i++)
        {
            xor = xor ^ arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Number Appears Only Once : "+ xor);
    }
}
