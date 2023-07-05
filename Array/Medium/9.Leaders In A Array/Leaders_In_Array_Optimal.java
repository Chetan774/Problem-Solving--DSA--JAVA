package ARRAY.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Leaders_In_Array_Optimal
{
    public static Object[] LeadersInArray(int arr[])
    {
        ArrayList<Integer> leaders = new ArrayList<>();

          int max_element_At_Left = arr[arr.length-1];



        for (int i = arr.length-1; i >= 0 ; i--)
        {
            if(arr[i] >= max_element_At_Left)
            {
                leaders.add(arr[i]);
                max_element_At_Left = arr[i];
            }
        }

        return leaders.toArray();
    }

    public static void main(String[] args)
    {
        int arr[] = {10,22,12,3,0,6};

        Object leaders[] = LeadersInArray(arr);
//        Arrays.sort(leaders);
        System.out.println("Input Array : " + Arrays.toString(arr));
        System.out.println("Leaders in array are : " + Arrays.toString(leaders));

        System.out.println( "\n 1. Time : close to O(N) In worst Case"+
                "\n 2. Space : Worst case if input array is sorted in decending order O(N)"+
                "\n 3. The extra space is used to store the leaders not to solve problem");
    }
    }

