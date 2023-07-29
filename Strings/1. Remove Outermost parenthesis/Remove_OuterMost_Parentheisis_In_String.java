package ARRAY;

import java.util.Stack;

public class Remove_OuterMost_Parentheisis_In_String
{
    public static String RemoveOuterParenthesis(String s)
    {
        Stack<Character> stack = new Stack<>();

        String ans  = "";

        for(int i = 0; i < s.length(); i++)
        {
            char ch  = s.charAt(i);

            if(ch == '(')
            {
                if(stack.size() > 0)
                {
                    ans = ans + ch;
                }
                stack.push(ch);
            }
            else   // if(ch == ')')
            {
                stack.pop();

                if(stack.size() > 0)
                {
                    ans = ans + ch;
                }
            }
        }

        return ans;
    }


    public static void main(String args[])
    {
        String s = "(()(()))";

        String result = RemoveOuterParenthesis(s);

        System.out.println(result);
    }
}
