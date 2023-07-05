package ARRAY;

public class Find_Missing_No_BruteForce
{
    public static void main(String[] args)
    {

//        Time Complexity : O(n)

        int arr[] = {0,1,2,4};

        int flag = 0;

        for (int i = 0; i <= arr.length; i++)
        {
            flag = 0;

            for (int j = 0; j < arr.length; j++)
            {
                 if( i == arr[j])
                 {
                     flag = 1;
                 }
            }

            if (flag == 0)
            {
                System.out.println(i);
            }
        }
    }


}
