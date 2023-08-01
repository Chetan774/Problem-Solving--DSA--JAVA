package Strings;

public class Reverse_String_Raw
{
    public static void main(String[] args) {
        String s  ="I am chetan";

        String ans = "";
        s+= " ";
        String temp = "";

        for(int i  =0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch == ' ')
            {
                if(temp != "")
                {
                    ans = " "+ temp + ans;
                    temp = "";
                }
            }
            else
            {
                temp = temp + ch;
            }
        }

        System.out.println(ans.trim());
    }
}
