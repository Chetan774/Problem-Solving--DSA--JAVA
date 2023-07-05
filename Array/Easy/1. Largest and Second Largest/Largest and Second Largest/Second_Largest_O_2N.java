package ARRAY;

import java.util.Arrays;

public class Second_Largest_O_2N
{
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,2,5,7,7};


        // step-1 find largest -  Time =  O(N)


        int largest = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]  > largest)
            {
                largest = arr[i];
            }
        }


        // step - 2 find second largest using largest - Time =  O(N)

        int Second_Largest = -1;

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > Second_Largest && arr[i] != largest )
            {
                Second_Largest = arr[i];
            }
        }

        System.out.println("Array : "+ Arrays.toString(arr) +"\n Largest : "+ largest +
        "\n Second Largest : "+ Second_Largest);

        System.out.println("Total time : O(N+N) = O(2N)");





    }
}
