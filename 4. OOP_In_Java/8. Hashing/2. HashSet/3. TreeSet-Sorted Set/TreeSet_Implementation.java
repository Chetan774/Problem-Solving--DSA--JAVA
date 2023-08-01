package OOP_In_Java;

import java.util.TreeSet;

public class TreeSet_Implementation
{
    public static void main(String[] args)
    {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(5);

        System.out.println("Elements are sorted in Ascending order in TreeSet");
        System.out.println(set);

    }
}
