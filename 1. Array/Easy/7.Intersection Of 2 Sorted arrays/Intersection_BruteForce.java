package ARRAY;

import java.util.ArrayList;

public class Intersection_BruteForce
{
    public static void main(String[] args)
    {

        int arr1[] = {2,2,2,4,5,6,7};
        int arr2[] = {2,2,4,5,8,8,9};

        ArrayList<Integer> list = new ArrayList<>();

        int visited[] = new int[arr2.length];


        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j] && visited[j] == 0 )
                {
                    list.add(arr1[i]);
                    visited[j] = 1;

                }

                if(arr2[j] > arr1[i])
                {
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
