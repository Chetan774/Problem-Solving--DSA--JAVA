package ARRAY.Easy;
import java.util.*;

public class Valid_parenthesis_Stack
{

    public static boolean isValid(String s)
    {
        Stack<Character> s1 = new Stack<> ();

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);


            if(ch == '{' || ch == '['|| ch == '(' )
            {
                s1.push(ch);
            }
            else
            {

                if(s1.isEmpty())
                {
                    return false;
                }

                if(  ( s1.peek() == '(' && ch == ')') ||
                        ( s1.peek() == '[' && ch == ']') ||
                        ( s1.peek() == '{' && ch == '}')
                )
                {
                    s1.pop();
                }
                else
                {
                    return false;
                }

            }

        }

        if(s1.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "[{()}]";
        String str2 = "[(){[}";
        boolean ans = isValid(str2);

        System.out.println(  " Is "+str2+" a valid parenthesis: "+ ans);

    }
}
