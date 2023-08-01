package OOP_In_Java;
import java.util.*;


public class TreeMap_Implementation
{
    public static void main(String[] args)
    {
        TreeMap<String,Integer> map = new TreeMap<>();

        map.put("India", 10000);
        map.put("China", 50000);
        map.put("Nepal", 60000);
        map.put("America", 30000);

        System.out.println("Time Complexity : O(Log(N))");
        System.out.println("Data Is stored in Storted Order of Keys");
        System.out.println(map);
    }
}
