package ARRAY.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majority_Element_Better
{
//    Time : O(N* logN) + O(N)
//    O(N) : Iterating Over  whole array
//    O(logN) : storing element in hashmap
//        O(N) : Iterating Over HashMap

//    Space : O(N) storing all elements of array in hashmap


    public static int func(int arr[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
                int value = map.getOrDefault(arr[i],0);
                map.put(arr[i],value+1);
        }

        System.out.println(map);
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
           if(entry.getValue() > arr.length/2)
           {
               return entry.getKey();
           }
        }

        return 0;
    }


    public static void main(String[] args) {
        int arr[] = {3,1,2,3,3,2,2,3,3};
        int result = func(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Majority_Element_Better : " + result);
    }
}
