package ARRAY;

import java.util.Arrays;

public class Max_No_Of_Consecutive_Ones
{
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0};
        int cnt = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 1)
            {
                cnt++;
                //    max = Math.max(max,cnt); takes more time

                if(max < cnt)
                {
                    max = cnt;
                }

            }
            else {
                cnt = 0;
            }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum Consecutive 1's in a array : "+ max);
    }
}
