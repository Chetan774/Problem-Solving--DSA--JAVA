package ARRAY.Medium;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.*;


public class Optimal_No_Equal_Ptive_Ntive
{
    // the array does not contains equal no of +ve and -ve nos

    //Time complexity : O(2N)
    //Space Complexity : O(N)

    public static int[] rearrangeArray(int arr[])
    {
        ArrayList<Integer> positives = new ArrayList<>();

        ArrayList<Integer> negatives = new ArrayList<>();


        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 0)
            {
                positives.add(arr[i]);
            }
            else
            {
                negatives.add(arr[i]);
            }
        }


        if(positives.size() < negatives.size())
        {
            for (int i = 0; i < positives.size(); i++)
            {

                arr[i*2] = positives.get(i);
                arr[i*2+1] = negatives.get(i);
            }

            for (int i = positives.size(); i < negatives.size(); i++)
            {
                arr[i] = negatives.get(i);
            }
        }
        else
        {
            for (int i = 0; i < negatives.size(); i++)
            {

                arr[i*2] = positives.get(i);
                arr[i*2+1] = negatives.get(i);
            }

            for (int i = negatives.size(); i < positives.size(); i++)
            {
                arr[i] = positives.get(i);
            }
        }

        return arr;
    }

    public static void main(String[] args)
    {
        int arr[] = {-1,3,-5,7};

        int result[] = rearrangeArray(arr);

        System.out.println(Arrays.toString(result));
    }
}
