package OOP_In_Java;

import java.util.LinkedHashMap;

public class LinkedHashMap_Implementation
{
    public static void main(String[] args)
    {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Chetan");
        map.put(2, "Om");
        map.put(3, "Chaitanya");
        map.put(4, "Omkar");

        System.out.println("Elements Are Stored According To Insertion Order");
        System.out.println("Doubly LinekdList is Used For storing elements");
        System.out.println(map);
    }
}
