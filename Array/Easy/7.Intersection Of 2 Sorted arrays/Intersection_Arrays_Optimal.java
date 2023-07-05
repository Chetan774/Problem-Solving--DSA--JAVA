package ARRAY;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_Arrays_Optimal
{
    public static void main(String[] args)
    {

        int arr1[] = {2,2,2,4,5,6,7};
        int arr2[] = {2,2,4,5,8,8,9};

        ArrayList<Integer> list = new ArrayList<>();


        int i = 0;
        int j = 0;

        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                i++;
                continue;
            }
            else if(arr2[j] < arr1[i])
            {
                j++;
            }
            else //if(arr1[i] == arr2[j])
            {
                list.add(arr1[i]);
                i++;
                j++;
            }


        }

        System.out.println("Input Arrays : "+ "\n");
        System.out.println("Arr1 : " + Arrays.toString(arr1)+"\n"+ "Arr2 : " +Arrays.toString(arr2)+"\n");
        System.out.println("Intersection of Arr1 + Arr2 : "+ list);
    }
}
