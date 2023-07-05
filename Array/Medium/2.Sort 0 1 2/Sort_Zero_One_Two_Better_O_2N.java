package ARRAY.Medium;

import java.util.Arrays;

public class Sort_Zero_One_Two_Better_O_2N
{
//    Better Solution
//    Time : O(2N)
//    Space : O(1) : No extra space used
    public static void sort(int arr[])
    {
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
            {
                count_0++;
            }
            else if(arr[i] == 1)
            {
                count_1++;
            }
            else
            {
                count_2++;
            }
        }

//        System.out.println(count_0);
//        System.out.println(count_0+count_1);
//        System.out.println(count_2);

        for (int i = 0; i < count_0; i++)
        {
          arr[i] = 0;
        }

        for (int i = count_0; i < count_0+count_1; i++)
        {
            arr[i] = 1;
        }

        for (int i = count_1+count_2; i < count_0+count_1+count_2; i++)
        {
            arr[i] = 2;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,1,2,0,0,0};



        System.out.println("Input Array : "+ Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted Array : "+ Arrays.toString(arr));
    }
}
