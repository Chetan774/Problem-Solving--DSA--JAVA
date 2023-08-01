package OOP_In_Java;
import java.util.*;
public class Heap_Sort
{
    public static void heapify(int arr[], int i, int size)
    {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int MaxIndex = i;

        if(left < size && arr[left] > arr[MaxIndex])
        {
            MaxIndex = left;
        }
        if(right  < size && arr[right] > arr[MaxIndex])
        {
            MaxIndex = right;
        }

        if(MaxIndex != i)
        {
            int temp = arr[i];
            arr[i] = arr[MaxIndex];
            arr[MaxIndex] = temp;

            heapify(arr, i, size);
        }
    }
    public static void HeapSort(int arr[])
    {
        //step - 1 : create max heap out of given array


        int n = arr.length;

        for(int i = n-1; i >= 0; i--)
        {
            heapify(arr, i, n);
        }

        //step - 2 : swap 1st and last element and again heapify the array to fix it as Maxheap

        for(int i = n -1 ; i > 0; i--)
        {
            //swap

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            //heapify to make it max heap again

            heapify(arr,0, i);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,4,5,3};

        HeapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
