package OOP_In_Java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Implementation
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(4);
        set.add(1);
        set.add(3);
        set.add(2);


        System.out.println("Elements Will Be Stored In Same Order AS Inserted IN LinkedHashSet");
        Iterator it = set.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
