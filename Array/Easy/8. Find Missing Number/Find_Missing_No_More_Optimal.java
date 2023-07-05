package ARRAY;

import java.util.Arrays;

public class Find_Missing_No_More_Optimal
{
    //Most Optimal  Time : O(N) Space O(1)

    public static void main(String[] args)
    {
        int arr[] = {0, 1, 2, 3,4, 6};


        int xor1 = 0;

        int xor2 = 0;

        for (int i = 0; i < arr.length; i++)
        {
            xor1 = xor1 ^ arr[i];

            xor2 = xor2 ^ i+1;
        }

        int missing_No = xor1 ^ xor2;



        System.out.println("Input Array : "+ Arrays.toString(arr));
        System.out.println("missing No is :  "+ missing_No);
        System.out.println("Time : O(n)"+" \n" +"Space : O(1)");
    }
}
