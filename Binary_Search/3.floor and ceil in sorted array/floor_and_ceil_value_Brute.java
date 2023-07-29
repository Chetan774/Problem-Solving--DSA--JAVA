import java.util.Arrays;

public class floor_and_ceil_value_Brute
{
    public static int[] ceilingInSortedArray( int[] arr, int x)
    {
        Arrays.sort(arr);

        int ceiling = -1, floor = -1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= x)
            {
                ceiling = arr[i];
                break;
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] <= x)
            {
                floor = arr[i];
            }
        }

        System.out.println("floor : "+floor);
        System.out.println("ceiling : "+ ceiling);

        return new int[]{ceiling , floor};

    }
    public static void main(String[] args)
    {
        int arr[] = {3, 4, 4, 7, 8, 10};

        int  x= 8;

        int result[] = ceilingInSortedArray(arr,x);

        System.out.println("Floorand ceil value for "+ x + " is : ");

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(result));

    }
}

