package ARRAY;

import java.util.Arrays;

public class Find_Missing_No_Better
{

    //Better Approach
    //Time Complexity : O(n + n) = O(2n)
    // Space Complexity : O(n)  : bcoz we created new Hash array arr2

    public static void main(String[] args) {
        int arr[] = {0,1,2,4};

        int arr2[] = new int[4+1];

        System.out.println("Input Array : "+ Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++)
        {
            arr2[arr[i]] = 1;
        }

        for (int i = 1; i < arr2.length; i++)
        {
               if(arr2[i] == 0)
               {
                   System.out.println("Missing No is : " + i);
               }
        }
    }


}
