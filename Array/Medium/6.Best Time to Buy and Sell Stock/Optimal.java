package ARRAY.Medium;

public class Optimal
{
    public static int maxProfit(int[] arr)
    {
        int min_element = arr[0];

        int max_profit = 0;

        for(int i = 1; i < arr.length;i++)
        {
            int cost = arr[i] - min_element;

            max_profit = Math.max( max_profit , cost );

            min_element = Math.min(arr[i],min_element);

        }

        return max_profit;

    }

    public static void main(String[] args)
    {
        int arr[] = {7,1,2,3,4,5,6};
        System.out.println(maxProfit(arr));

    }
}
