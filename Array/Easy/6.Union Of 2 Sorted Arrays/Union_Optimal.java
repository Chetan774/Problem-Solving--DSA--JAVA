package ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Union_Optimal
{
    public static void main(String[] args)
    {

//        Time complexity : log(n1+n2)


        int arr1[] = {1,2,2,3,5,7};
        int arr2[] = {2,4,5,8,8,9};

        List<Integer> list = new ArrayList<>();

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0;
        int j = 0;

        while(i < n1 && j < n2)
        {
            if(arr1[i] <= arr2[j])
            {
                if(list.size() == 0 || list.get(list.size()-1) != arr1[i])
                {
                    list.add(arr1[i]);
                }
                i++;
            }
            else
            {
                if(list.size() == 0 || list.get(list.size()-1) != arr2[j])
                {
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < n1)
        {

                if(list.get(list.size()-1) != arr1[i])
                {
                    list.add(arr1[i]);
                }
                i++;

        }

        while(j < n2)
        {
            if(list.get(list.size()-1) != arr2[j])
            {
                list.add(arr2[j]);
            }
            j++;
        }

        System.out.println("Input Arrays : "+ "\n arr1 : "+ Arrays.toString(arr1)+"\n arr2 : "+ Arrays.toString(arr2)+ "\n");

        System.out.println("After Union : "+ list);
    }
}
