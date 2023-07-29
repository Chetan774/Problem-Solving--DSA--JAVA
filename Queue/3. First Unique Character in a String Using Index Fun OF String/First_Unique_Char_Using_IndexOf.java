package ARRAY;

public class First_Unique_Char_Using_IndexOf
{
    public static int firstUnique(String s) {

        int min = Integer.MAX_VALUE;

        for (char i = 'a'; i <= 'z'; i++) {
            int idx = s.indexOf(i);

            if (idx != -1 && idx == s.lastIndexOf(i)) {
                min = Math.min(idx, min);
            }




        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }

        return min;
    }

    public static void main(String[] args) {
        String s = "leelovecode";

        int ans = firstUnique(s);

        System.out.println(s);
        System.out.println("Index Of First Unique Char Is : "+ ans);

    }
}
