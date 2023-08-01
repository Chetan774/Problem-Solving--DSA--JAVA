package OOP_In_Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Iterating_HashMap_Using_EntrySet_Method
{
    public static void main(String[] args)
    {
        HashMap< String , Integer> hm = new HashMap<>();

        hm.put("India", 1000);
        hm.put("Nepal", 2000);
        hm.put("China", 4000);


        Set<Map.Entry<String, Integer>> entry = hm.entrySet();

        for(Map.Entry<String,Integer> i : entry)
        {
//            System.out.println(i);
            System.out.println("Key : "+ i.getKey()+ " "+ "Value : "+ i.getValue());
        }

    }
}
