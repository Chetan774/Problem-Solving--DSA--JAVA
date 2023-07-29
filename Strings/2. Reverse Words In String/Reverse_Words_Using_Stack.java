package Strings;
import java.util.*;
public class Reverse_Words_Using_Stack
{
    public static void main(String[] args)
    {
        String s = "I am Chetan patil";

        Stack<String> stack  = new Stack<>();

         s += " ";

        String str = "";

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch == ' ')
            {
                if(str != " ")
                {
                    stack.push(str);
                    str = "";
                }

            }
            else
            {
                str = str + ch;
            }

        }

        String ans = "";

        while(stack.size() != 1)
        {
            ans = ans + stack.pop() + " ";
        }

        ans = ans + stack.pop();

       System.out.println(ans);

    }
}
