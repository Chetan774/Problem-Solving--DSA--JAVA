package ARRAY.Medium;

import java.util.Arrays;

public class Sort_Zero_One_Two_Optimal_O_N
{
    //Optimal Approach : O(N)
    //Space : O(1)
    public static void swap(int arr[],int x,int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void sort012(int[] arr)
    {

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[mid] == 0)
            {
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else if(arr[mid] == 2)
            {
                swap(arr,mid,high);
                high--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,1,0,0,2,2,1,1,0};
        System.out.println("Input Array : "+ Arrays.toString(arr));
        sort012(arr);
        System.out.println("Sorted Array : "+ Arrays.toString(arr));

    }
}
