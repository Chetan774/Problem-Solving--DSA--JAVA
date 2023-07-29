package ARRAY.Medium;
import java.util.*;
public class Reverse_String_Using_Stack
{
    public static String reverseString(String str)
    {
        Stack<Character> s = new Stack<>();

        int idx = 0;

        while (idx < str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }


        String result = "";

        while (!s.isEmpty())
        {
            result += s.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "abcd";



        System.out.println(s);
        String reverseString = reverseString(s);
        System.out.println(reverseString);
    }
}
