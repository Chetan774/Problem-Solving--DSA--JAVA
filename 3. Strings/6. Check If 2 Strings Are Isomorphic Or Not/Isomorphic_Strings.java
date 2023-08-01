package Strings;

public class Isomorphic_Strings
{
    public static boolean isIsomorphic(String s, String t)
    {
//        Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//        All occurrences of a character must be replaced with another character
//        while preserving the order of characters. No two characters may map
//        to the same character, but a character may map to itself.



        if(s.length() != t.length())
        {
            return false;
        }

        int arr1[] = new int[256];
        int arr2[] = new int[256];

        for(int i = 0; i < s.length();i++)
        {
            char ch1  = s.charAt(i);
            char ch2 = t.charAt(i);

            if(arr1[ch1] != arr2[ch2])
            {
                return false;
            }

            arr1[ch1] = i + 1;
            arr2[ch2] = i + 1;

        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("Two strings s and t are isomorphic if the characters " +
                "in s can be replaced to get t.");
        String s = "egg";
        String t  = "odd";
        boolean isIsomorphic  = isIsomorphic(s,t);

        System.out.println("s : "+ s+" \n"+ "t : "+ t);
        System.out.println(isIsomorphic);
    }
}
