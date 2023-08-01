package ARRAY.Medium;
import java.util.*;
public class Rearrange_Array_Elements_By_Sign_BruteForce
{

    public static int[] rearrangeArray(int[] arr)
    {
        ArrayList<Integer> positives = new ArrayList<>();

        ArrayList<Integer> negatives = new ArrayList<>();


        for(int i = 0; i < arr.length; i++)
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


        int l = 0,m = 0;

        int pointer = 0;


        for(int i = 0; i < arr.length; i++)
        {
            if(i % 2 == 0)
            {
                arr[i] = positives.get(l);
                l++;
            }
            else
            {
                arr[i] = negatives.get(m);
                m++;
            }
        }



        return arr;

    }
    public static void main(String[] args) {
        int arr[] = {-1,3,-5,7};
        int result[] = rearrangeArray(arr);
        System.out.println(Arrays.toString(result));

    }
}
