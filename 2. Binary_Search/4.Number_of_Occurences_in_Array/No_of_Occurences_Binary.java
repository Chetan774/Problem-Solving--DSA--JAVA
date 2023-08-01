import java.util.Arrays;

public class No_of_Occurences_Binary
{

    public static int Occurences_bianary(int arr[], int x)
    {
        int low = 0, high = arr.length-1;
        int count  = 0;

        while(low <= high)
        {
            int mid =( low + high ) / 2;

            if(arr[mid] == x)
            {
                count = 1;

                int left = mid - 1;

                while(left >= 0 && arr[left] == x )
                {
                    left--;
                    count++;
                }

                int right = mid + 1;

                while(right < arr.length && arr[right] == x )
                {
                    right++;
                    count++;
                }

                return count;
            }
            else if(arr[mid] > x)
            {
                high  = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2};
        int x = 2;
        int result = Occurences_bianary(arr, x);
        System.out.println(Arrays.toString(arr));
        System.out.println(x);
        System.out.println(result);

    }
}
