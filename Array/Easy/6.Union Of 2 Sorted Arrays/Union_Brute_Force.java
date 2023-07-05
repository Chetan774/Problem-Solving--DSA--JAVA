package ARRAY;

import java.util.Arrays;
import java.util.HashSet;

public class Union_Brute_Force
{
    public static void main(String[] args)
    {


        //brute force using set
        //Time Complexity : O(2n*logn)

        int arr1[] = {1,2,2,3,7};
        int arr2[] = {2,4,5,8,8,9};


        HashSet<Integer> set   = new HashSet<>();

        for (int i = 0; i < arr1.length; i++)
        {
             set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++)
        {
            set.add(arr2[i]);
        }

        int union[] = new int[set.size()];


        int i = 0;

        for(Integer it : set)
        {
            union[i++] = it;
        }

        System.out.println("Input Arrays : "+ "\n arr1 : "+ Arrays.toString(arr1)+"\n arr2 : "+
                Arrays.toString(arr2)+ "\n");

        System.out.println("union : "+Arrays.toString( union));


    }
}
