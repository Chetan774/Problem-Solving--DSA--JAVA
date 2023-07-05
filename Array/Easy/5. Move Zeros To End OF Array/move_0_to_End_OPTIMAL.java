package ARRAY;

import java.util.Arrays;

public class move_0_to_End_OPTIMAL
{

    public static void swap(int arr[],int x,int y)
    {
        int temp  = arr[x];
        arr[x] = arr[y];
        arr[y] =  temp;
    }
    public static int[] moveZeroes(int[] nums)
    {
        int j = -1;

        for(int i = 0; i < nums.length;i++)
        {
            if(nums[i] == 0)
            {
                j = i;
                break;
            }
        }

        if(j == -1){return nums;}

        for(int i = j+1; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                swap(nums,i,j);
                j++;
            }
        }

        return nums;
    }
    public static void main(String[] args)
    {
        int arr[]  = {1,2,0,3,4,0,5,6};

        System.out.println(Arrays.toString(arr));

        int result[] = moveZeroes(arr);

        System.out.println(Arrays.toString(result));

    }
}
