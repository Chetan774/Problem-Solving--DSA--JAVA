package ARRAY.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Leaders_In_Array_BruteForce
{

    //Time : close to O(N) In worst Case
    // Space : Worst cose if input array is sorted in decending order O(N)
    //The extra space is used to store the leaders not to solve problem

    public static boolean checkSortedInDecending(int arr[],int start)
    {
        for (int i = start; i < arr.length ; i++)  //O(N)
        {
            if(arr[start] < arr[i])
            {
                return false;
            }
        }

        return true;


    }

    public static Object[] LeadersInArray(int[] arr)
    {
        ArrayList<Integer> leaders = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) //O(N)
        {
            if(checkSortedInDecending(arr,i))
            {
                leaders.add(arr[i]);
            }
        }


        return leaders.toArray();

    }
    public static void main(String[] args) {
        int arr[] = {4, 7, 1, 0};

        Object leaders[] = LeadersInArray(arr);
        System.out.println("Input Array : "+ Arrays.toString(arr));
        System.out.println("Leaders in array are : "+ Arrays.toString(leaders));

        System.out.println();
        System.out.println( "\n 1. Time : close to O(N ^ 2) In worst Case"+
                "\n 2. Space : Worst cose if input array is sorted in decending order O(N)"+
                "\n 3. The extra space is used to store the leaders not to solve problem");
    }
}
