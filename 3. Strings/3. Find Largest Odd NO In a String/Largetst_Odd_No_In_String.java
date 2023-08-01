package Strings;

public class Largetst_Odd_No_In_String
{
    public static String largestOddNumber(String num)
    {
        String ans  = "";


        if((num.charAt(num.length()-1) - '0') % 2 != 0)
        {
            return num;
        }


        for(int i = num.length()-1; i >= 0; i--)
        {
            char ch = num.charAt(i);

            int a = ch - '0';

            if(a % 2 != 0)
            {

                return num.substring(0,i+1);
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        String s = "1234";
        String ans  = largestOddNumber(s);
        System.out.println("Largest Odd No in a string : "+s+" \n is : " +ans);

    }
}
