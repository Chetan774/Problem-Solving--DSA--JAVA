package OOP_In_Java;
import java.util.*;

public class HashMap_Implementation
{
    public static void main(String[] args)
    {
        HashMap< String , Integer> hm = new HashMap<>();

        hm.put("India", 1000);
        hm.put("Nepal", 2000);
        hm.put("China", 4000);

//        System.out.println(hm);

//        Set<String> key = hm.keySet();

//        System.out.println("Keys  : ");

//        for(String i : key)
//        {
//            System.out.print(i+" ");
//        }

        Set<Map.Entry<String, Integer>> entry = hm.entrySet();


        for(Map.Entry<String, Integer> i : entry)
        {
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }

    }
}
