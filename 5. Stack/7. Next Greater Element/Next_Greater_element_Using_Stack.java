package ARRAY.Easy;
import java.util.*;
public class Next_Greater_element_Using_Stack
{

    public static int[] nextGreater(int arr[])
    {
        int nextGreater[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();


        for(int i = arr.length-1; i >= 0; i--)
        {
            int currElement = arr[i];

            while(!s.isEmpty() &&  currElement >= arr[s.peek()])
            {
                s.pop();
            }

            if(s.isEmpty())
            {
                nextGreater[i] = -1;
            }
            else
            {
                nextGreater[i] = arr[s.peek()];
            }

            s.push(i);
        }
        return nextGreater;
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int result[] = nextGreater(arr);
        System.out.println(Arrays.toString(result));


    }
}
