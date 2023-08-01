package Strings;
import java.util.*;

public class Longest_Common_Prefix_Among_StringArary
{
    public static  String longestCommonPrefix(String[] s)
    {

        String LongestPrefix = "";

        Arrays.sort(s);

        int idx = 0;

        String s1 = s[0];
        String s2 = s[s.length-1];


        while(idx < s1.length() && idx < s2.length())
        {
            if(s1.charAt(idx) == s2.charAt(idx))
            {
                idx++;
            }
            else
            {
                break;
            }
        }

        LongestPrefix = s1.substring(0,idx);

        if(LongestPrefix.equals(""))
        {
            return (String)("No Common Prefix exist");
        }
        return LongestPrefix;

    }

    public static void main(String arg[])
    {
        String s[] = {"flower","flow","flight"};


        String ans  = longestCommonPrefix(s);
        System.out.println("Input String Array : "+ Arrays.toString(s));
        System.out.println("Longest Common Prefix will be : "+ ans);


        System.out.println();
        System.out.println();

        String str[] = {"dog","racecar","car"};
        String ans2  = longestCommonPrefix(str);
        System.out.println("Input String Array : "+ Arrays.toString(str));
        System.out.println("Longest Common Prefix will be : "+ ans2);



    }
}
