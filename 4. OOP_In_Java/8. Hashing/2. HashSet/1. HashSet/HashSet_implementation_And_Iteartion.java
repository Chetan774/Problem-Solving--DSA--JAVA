package OOP_In_Java;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_implementation_And_Iteartion
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);


//        System.out.println(set);
        System.out.println("Iterating Using Iterator");
        Iterator it  = set.iterator();

        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("Iterating Using Enhanced For Loop");

        for(Integer i : set)
        {
            System.out.print(i+" ");
        }
    }
}
