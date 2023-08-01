package OOP_In_Java;

import java.util.HashMap;
import java.util.Set;

public class Iterating_HashMap_Using_KeySet_Method
{
    public static void main(String[] args)
    {
        HashMap< String , Integer> hm = new HashMap<>();

        hm.put("India", 1000);
        hm.put("Nepal", 2000);
        hm.put("China", 4000);


        Set<String> key = hm.keySet();

        for(String i : key)
        {
            System.out.print("Key : "+i+" "+ "Value : "+ hm.get(i));
            System.out.println(hm.get(i));


        }

    }
}
