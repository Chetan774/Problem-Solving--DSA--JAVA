package Strings;
import java.util.*;

public class Integer_To_Roman
{
    public static String intToRoman(int num)
    {
        HashMap<Integer,String> map  = new HashMap<>();

        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(90,"XC");
        map.put(4,"IV");
        map.put(9,"IX");
        map.put(40,"XL");

        int arr[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};


        String ans = "";

        int i = arr.length-1;

        while(num > 0)
        {
            int curr = arr[i];
            int multiple = num / curr;


            if(multiple > 0)
            {
                for(int j = 0; j < multiple; j++)
                {
                    ans += map.get(curr);
                }

                num = num % curr;
            }

            i--;
        }

        return ans ;


    }


    public static void main(String[] args) {
        int number = 3999;
        String ans  = intToRoman(number);

        int num2  = 4;

        System.out.println(number);
        System.out.println(ans);

        System.out.println(num2);
        System.out.println(intToRoman(num2));

    }
}
