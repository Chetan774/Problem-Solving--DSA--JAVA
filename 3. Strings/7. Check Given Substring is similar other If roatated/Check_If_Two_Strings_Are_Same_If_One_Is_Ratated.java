package Strings;

public class Check_If_Two_Strings_Are_Same_If_One_Is_Ratated
{
    public static boolean rotateString(String s, String goal)
    {

        if(s.length() != goal.length())
        {
            return false;
        }
        s = s + s;

        if(s.contains(goal))
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "cdab";

        boolean ans = rotateString(s,t);

        System.out.println("S : "+ s+ " \n"+ "t : "+ t);
        System.out.println(ans);
    }
}
