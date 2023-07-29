package ARRAY;

import java.util.Stack;
import java.util.*;

public class Reverse_CharArray_Using_Stack
{
    public static void reverseString(char[] s)
    {

        Stack<Character> s1 = new Stack<>();

        for(int i = 0; i < s.length; i++)
        {
            s1.push(s[i]);
        }

        for(int i = 0; i < s.length; i++)
        {
            s[i] = s1.pop();
        }

    }

    public static void main(String[] args) {
        char arr[] = {'c','h','e','t','e','t','a','n'};

        System.out.println(Arrays.toString(arr));


        System.out.println("After Reverse : ");

        reverseString(arr);

        System.out.println(Arrays.toString(arr));


    }
}
