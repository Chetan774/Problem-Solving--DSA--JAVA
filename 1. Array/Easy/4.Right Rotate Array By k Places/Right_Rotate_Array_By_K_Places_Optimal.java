package ARRAY;
import  java.util.*;
public class Right_Rotate_Array_By_K_Places_Optimal
{

    public static void reverse(int arr[],int start,int end)
    {
        while(start <= end)
        {
            int temp = arr[start];
            arr[start]  = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {

        System.out.println(" Optimal Approach : Time Complexity : O(N)");

        /* Optimal Approach : Time Complexity : O(N)
        Step - 1 : reverse the part which we want to shift to right
          Step - 2 : reverse the remaining part
          Step - 3 : reverse whole array */

        int arr[] = {-1,-100,3,99};
        Scanner s = new Scanner(System.in);
        System.out.println("Ënter K : ");
        int k = s.nextInt();


        System.out.println(Arrays.toString(arr));

        reverse(arr,arr.length-k,arr.length-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,arr.length-k-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));


    }
}
