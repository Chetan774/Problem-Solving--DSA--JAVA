package ARRAY;

import java.util.Arrays;

public class LargestElementArray_Order_OF_N
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,5};

        int largest = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }

        System.out.println("Largest element in  : "+ Arrays.toString(arr)+ "\n largest : "+ largest);
        System.out.println("Time complexity is : O(N)");
    }
}
