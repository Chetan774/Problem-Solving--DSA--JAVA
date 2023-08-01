package ARRAY;

public class Square_Root_using_Binary_Search
{
    public static int sqrtN(long N)
    {
        long  low  = 1, high  = N;

        long x = N;

        long ans = 0;

        if(N  == 0 || N == 1)
        {
            return (int)N;
        }


        while(low <= high)
        {
            long mid = (low + high) / 2;

            if(mid * mid  <= x)
            {
                low  = mid + 1;
            }
            else //if(mid * mid > x)
            {
                high = mid -1 ;
            }
        }

        return (int)high;

    }

    public static void main(String[] args) {
        int x = 6;
        int x2 = 9;

        int ans = sqrtN(x2);
        System.out.println("Square Root of "+ x + " is : ");
        System.out.println(ans);
    }
}
