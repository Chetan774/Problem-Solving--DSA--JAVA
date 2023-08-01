package ARRAY;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_BruteForce
{
    // Brute Force   Time Complexity N(logN)+ N

    /* 1 - Iterate Through array and Store it into Set
        2 - Set doesn't store duplicates 
        3. Put all elements of set into start positions of array */

    public static void main(String[] args)
    {
        int arr[] = {1,2,2,2,3,4,5};

        Set<Integer> S = new HashSet<Integer>();


        //1 - Iterate Through array and Store it into Set

        for (int i = 0; i <arr.length; i++)
        {
            S.add(arr[i]);

        }


        // Step 3. Put all elements of set into start positions of array

        int count  = 0;

        for(int  i : S)
        {
            arr[count] = i;
            count++;
        }

        System.out.println("Set : "+ S);

        // Step 3. Put all elements of set into start positions of array

        System.out.println("Sorted Array : " + Arrays.toString(arr));

        System.out.println("Time Coplexity : N(log(N) + N");

    }


}
