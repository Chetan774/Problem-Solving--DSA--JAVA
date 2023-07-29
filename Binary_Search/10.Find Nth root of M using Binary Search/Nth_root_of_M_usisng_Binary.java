package ARRAY;

public class Nth_root_of_M_usisng_Binary
{
    //whe have to find m ^ (1/n)

    public static int pow(int mid, int n, int m)
    {
        long ans = 1;

        for (int i = 1; i <= n; i++)
        {
            ans = ans * mid;

            if (ans > m) return 2;
        }

        if (ans == m) return 1;

        return 0;
    }

    public static int NthRoot(int n, int m)
    {

        int low = 1, high = m;

        while (low <= high)
        {
            int mid = (low + high) / 2;

            int midN = pow(mid, n, m);

            if(midN == 1)
            {
                return mid;
            }
            else if(midN == 0)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int n = 3;
        int m = 27;

        System.out.println("n : "+ n);
        System.out.println("m : "+ m);
        System.out.println("whe have to find m ^ (1/n)");

        int ans = NthRoot(n,m);
        System.out.println( n+"th  Root of "+ m + " is : ");
        System.out.println(ans);
    }
}
