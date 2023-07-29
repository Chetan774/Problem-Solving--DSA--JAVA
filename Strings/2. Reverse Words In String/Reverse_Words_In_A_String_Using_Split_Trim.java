package ARRAY;

public class Reverse_Words_In_A_String_Using_Split_Trim
{

    public static String ReverseWords(String s)
    {
        String ans[] = null;
        StringBuilder sb = new StringBuilder();

        ans = s.split("\\s+");

        for(int i = ans.length-1; i >= 0; i--)
        {
            sb.append(ans[i].trim()+ " ");
        }

        return sb.toString().trim();

    }
    public static void main(String str[])
    {
        String s = "I am Chetan Patil";


        String ans  = ReverseWords(s);

        System.out.println(ans);
    }
}
