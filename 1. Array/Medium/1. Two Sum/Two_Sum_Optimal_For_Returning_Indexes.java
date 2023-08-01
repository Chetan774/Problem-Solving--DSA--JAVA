package ARRAY;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum_Optimal_For_Returning_Indexes
{
//    Time : O(n * log(N))
//    Space : O(N)  : storing N elements in hashmap


    public static int[]  fun_Two_sum(int arr[], int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        int result[] = new int[2];

        for (int i = 0; i < arr.length; i++)
        {
              if(!(map.containsKey(k - arr[i])))
              {
                  map.put(arr[i],i);
              }
              else
              {
                  result[0] = map.get(k - arr[i]);
                  result[1] = i;

                  return result;
              }
        }

        return result;

    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6};
        int result[] = fun_Two_sum(arr,7);
        System.out.println(Arrays.toString(result));
    }
}
