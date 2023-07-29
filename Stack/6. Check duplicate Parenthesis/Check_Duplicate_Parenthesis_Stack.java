package ARRAY.Easy;
import java.util.*;

public class Check_Duplicate_Parenthesis_Stack
{
    public static String IsDuplicateParentheis(String str)
    {
        Stack<Character> s= new Stack<>();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int count  = 0;
            if(ch == ')')
            {
                while(  s.peek() != '(')
                {
                    s.pop();
                    count++;
                }

                System.out.println(s);
                if(count < 1) {
                    return "Duplicate Exists";
                }
                else
                {
                    s.pop();
                }

            }
            else
            {

                s.push(ch);
                System.out.println(s);

            }


        }
        return "Duplicate Doesnt Exists";
    }

    public static void main(String[] args) {
        String str = "((a+b)+(c))";
        String res = IsDuplicateParentheis(str);
        System.out.println(res);

    }
}
