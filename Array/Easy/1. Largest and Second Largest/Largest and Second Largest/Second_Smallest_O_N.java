package ARRAY;

public class Second_Smallest_O_N
{
    public static void main(String[] args)
    {

        //Best Approach Second Smallest --  Time O(N)


           int arr[] = {7,3,1,5,2};

           int smallest = arr[0];
           int SecondSmallest = -1;


        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] < smallest)
            {
                SecondSmallest = smallest;
                smallest = arr[i];

            }
            else if(arr[i] < SecondSmallest)
            {
                SecondSmallest = arr[i];
            }

        }

        System.out.println("Smallest : "+ smallest +"\nSecond Smallest : "+ SecondSmallest);
    }
}
