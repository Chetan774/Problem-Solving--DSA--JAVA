package ARRAY.Medium;

public class Best_Time_to_Buy_And_Sell_Stock_BruteForce
{
    public static int maxProfit(int[] arr)
    {
        int  n = arr.length;

        int pointer1 = n-1, pointer2 = 0;


        int max_profit = 0;

        pointer2 = pointer1 - 1;

        while(pointer1 > 0)
        {


            if(pointer2 >= 0)
            {
                int curr_profit = arr[pointer1] - arr[pointer2];

                if(curr_profit > max_profit)
                {
                    max_profit = curr_profit;

                }
                pointer2--;

            }
            else
            {
                pointer1--;
                pointer2 = pointer1 - 1;
            }
        }


        return max_profit;


    }
    public static void main(String[] args)
    {
        int arr[] = {7,1,2,3,4,5,6};
        System.out.println(maxProfit(arr));

    }
}
