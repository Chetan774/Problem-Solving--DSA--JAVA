package ARRAY;

public class Maximum_Subarray_Sum_BruteForce
{
    public static  int func(int arr[])
    {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum = arr[i];
            for (int j = i+1; j < arr.length; j++)
            {
               sum = sum + arr[j];

               if(sum > max)
               {
                   max = sum;
               }
            }


        }

        if(arr[arr.length-1] > max)
        {
            max = arr[arr.length-1];
        }
        return max;
    }


    public static void main(String[] args) {
        int arr[] = {1,-1,2,-3,6};
        int result = func(arr);

        System.out.println(result);
    }
}
