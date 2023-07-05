package ARRAY.Medium;

import java.util.Arrays;

public class L_C_Sequence_Brute
{
    public static int longest_c_Sequence(int arr[])
    {
        Arrays.sort(arr); //Time : (N * log(N))

        System.out.println(Arrays.toString(arr));
        int longest_Sequence = 1;
        int max =  1;

        for (int i = 0; i < arr.length-1; i++) //Time : O(N)
        {

                if(arr[i] == arr[i+1])
                {
                    continue;
                }
                if(arr[i] == (arr[i+1] - 1))
                {
                   max++;
                }
                else
                {
                    max = 1;
                }

            if(max > longest_Sequence)
            {
                longest_Sequence = max;
            }
        }

        return longest_Sequence;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,100,200,3,4,2,1};
        int result = longest_c_Sequence(arr);
        System.out.println(result);
    }
}
