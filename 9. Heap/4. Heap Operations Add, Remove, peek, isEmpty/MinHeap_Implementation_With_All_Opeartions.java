package OOP_In_Java;

import java.util.ArrayList;

public class MinHeap_Implementation_With_All_Opeartions
{
    static ArrayList<Integer> arr = new ArrayList<>();
    public  static class MinHeap
    {
        public  void add(int data)
        {
            //x  -> child index
            // par -> parent index
            arr.add(data);
            int x = arr.size()-1;
            int par = (x -1)/2;


            //swapping till we right pos for child
            while( arr.get(x)  < arr.get(par) )
            {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }

        }

        private static void heapify(int i) //logN // bubbling up
        {
            int root = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            int minIndex = i;

            //find min Element among root left child and right child

            if(left < arr.size() && arr.get(left) < arr.get(minIndex))
            {
                minIndex = left;
            }

            if(right < arr.size() && arr.get(right) < arr.get(minIndex))
            {
                minIndex = right;
            }

            if(minIndex != i)
            {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);
                heapify(minIndex);
            }

        }
        public static int remove()
        {
            int data  = arr.get(0);

            //step1 - swap 1st and last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step -2 Delete Last Element

            arr.remove(arr.size()-1);

            //step-3 Heapify - reorder heap in such way that it becomes min heap again

            heapify(0);
            return data;

        }

        public int peek()
        {
            return  arr.get(0);
        }

        public static boolean isEmpty() { return  arr.size() == 0;}


    }


    public static void main(String[] args)
    {
       MinHeap h = new MinHeap();
       h.add(1);
       h.add(3);
       h.add(2);
       h.add(5);
       h.add(6);

       while(!h.isEmpty())
       {
           System.out.println(h.peek());
           h.remove();
       }

    }
}
