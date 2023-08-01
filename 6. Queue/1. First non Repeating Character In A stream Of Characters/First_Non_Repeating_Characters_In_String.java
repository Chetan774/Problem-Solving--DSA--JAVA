package ARRAY;
import java.util.*;
public class First_Non_Repeating_Characters_In_String
{
    public static void FirstNonRepeatingChar(String s)
    {
        Queue<Character> q = new LinkedList<>();

        int freq[] = new int[26];

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            freq[ch-'a']++;
            q.add(ch);
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1)
            {
                q.remove();
            }

            if(q.isEmpty())
            {
                System.out.println(-1+" ");
            }
            else
            {
                System.out.println(q.peek());
            }
        }
    }
    public static void main(String[] args) {
        String s = "aabccxb";

        FirstNonRepeatingChar(s);
    }
}
