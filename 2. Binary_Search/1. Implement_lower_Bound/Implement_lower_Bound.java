package ARRAY;

import java.util.Arrays;

public class Implement_lower_Bound
{


    public static int lower_bound_ele(int arr[], int x)
    {
        int s = 0;
        int e = arr.length;
        int ans = 0;
        while(s < e)
        {
            int mid = (s + e) / 2;

            if(arr[mid] == x)
            {
                ans = mid;

                e = mid -1;
            }
            else if( arr[mid] > x)
            {
                e = mid;
            }
            else
            {
                s = mid + 1;
            }


        }

        return arr[ans];
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,5};
        int arr2[] = {3,5,8,15,19};

        int x = 9;
        int lower_bound  = lower_bound_ele(arr2,x);

        System.out.println(Arrays.toString(arr2));

        System.out.println(x);

        System.out.println("lower_bound : "+ lower_bound );

    }


}
