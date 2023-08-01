package OOP_In_Java;
import  java.util.*;
 class MinHeap
{
    ArrayList<Integer> arr = new ArrayList<>();

    //x  -> child index
    // par -> parent index

    int x = arr.size()-1;
    int par = (x -1)/2;

    public  void add(int data)
    {
        arr.add(data);
        //swapping till we right pos for child
        while( arr.get(x)  <= arr.get(par) )
        {
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);
        }
    }

    public int peek()
    {
        return  arr.get(0);
    }


}
public class Heap_Implementation
{
    public static void main(String[] args) {
        MinHeap mh = new MinHeap();
        mh.add(2);
        mh.add(3);
        mh.add(4);
        mh.add(5);
        mh.add(10);
        mh.add(6);

        System.out.println(mh);
    }
}
