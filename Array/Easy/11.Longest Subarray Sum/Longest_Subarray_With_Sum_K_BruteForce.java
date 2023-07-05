package ARRAY;

public class Longest_Subarray_With_Sum_K_BruteForce
{
    // Time complexity : O(n*n)

    public static  int fun(int arr[],int k)
    {
        int sum = 0;
        int count = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i; j < arr.length; j++)
            {
                if(sum > k )
                {
                    count = 0;
                    sum = 0;
                    break;

                }
                else if(sum ==  k)
                {
                    if(count > maxLength)
                    {
                        maxLength = count;
                    }
                    sum = 0;
                    count = 0;
                    break;
                }
                else
                {
                    System.out.print(arr[j] + " ");
                    sum = sum + arr[j];
                    count++;
                }
            }
            System.out.println();
        }

        if (maxLength == 0)
        {
            System.out.println("Subarray with sum : " + k + " Does Not Exist");
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,4,2,3};

        int longest_subarray_Length = fun(arr,11);

        System.out.println("longest_subarray_Length : " + longest_subarray_Length);
    }
}
