package ARRAY;

import java.util.Arrays;

public class Minimun_Absolute_Difference
{
    public static void main(String[] args) {
        int A[] = {1,2,3};
        int B[] = {2,1,3};

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));


        int TotalMinimumAbs = 0;

        for(int i = 0; i < A.length; i++)
        {
            TotalMinimumAbs += Math.abs(A[i] - B[i]);
        }

        System.out.println("Total Minimum Absolute Difference : "+ TotalMinimumAbs);
    }
}
