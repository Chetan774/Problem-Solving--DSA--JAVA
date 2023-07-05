package ARRAY;

import java.util.Arrays;

public class Second_Largest_O_N
{
    public static void main(String[] args)
    {

        //Best Approach Time O(N)
        // Finding largest and second largest in one loop only - Time O(N)

        int arr[] = {1,2,3,4,7,7,5};



       int largest = 0;
       int SecondLargest = -1;




        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {

                SecondLargest = largest;
                largest = arr[i];

            }
            else if(arr[i] > SecondLargest && arr[i] != largest)
            {
                SecondLargest = arr[i];
            }
        }

        System.out.println("Ärray : "+ Arrays.toString(arr));
        System.out.println("Largest : "+ largest + "\n Second Largest : "+ SecondLargest);
    }
}
