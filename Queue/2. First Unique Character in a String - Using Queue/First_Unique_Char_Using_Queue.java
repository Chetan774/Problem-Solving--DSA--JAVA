package ARRAY;

import java.util.LinkedList;
import java.util.Queue;

public class First_Unique_Char_Using_Queue
{
    public static int FirstUnique(String s)
    {
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++)
        {
               q.add(s.charAt(i));
        }

        char top = 0;

        int length = s.length();

        while(length > 0)
        {
            top = q.remove();

            if(!q.contains(top))
            {
                return s.indexOf(top);
            }
            else
            {
                q.add(top);
            }
            length--;
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";

        int ans = FirstUnique(s);

        System.out.println(s);
        System.out.println("Index Of First Unique Char Is : "+ ans);

    }
}
