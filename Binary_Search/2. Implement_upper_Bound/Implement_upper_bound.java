import java.util.Arrays;

public class Implement_upper_bound
{
    public static int upper_bound_ele(int arr[], int x)
    {
        int low = 0;
        int high = arr.length;

        int ans = arr.length;

        while(low <  high)
        {
            int mid  = (low + high)/ 2;

         if( arr[mid] == x )
         {

             while((arr[mid] == x ) && mid < arr.length)
             {
                 mid++;
                 ans = mid;
             }

             return arr[ans];
         }
         else if(arr[mid] > x)
         {
             high = mid;
         }
         else
         {
             low = mid+1;
         }

        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        int arr2[] = { 1,3,4,5};

        int x  = 3;

        int ans  = upper_bound_ele(arr2, x);


        System.out.println(Arrays.toString(arr2));
        System.out.println("x : "+ x);
        System.out.println(ans);

    }


}
