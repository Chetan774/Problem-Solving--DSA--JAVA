package ARRAY;
import java.util.*;

import java.util.ArrayList;

public class stack_Using_ArrayList {
    // stack implementation
    public static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            if (list.size() == 0)
            {
                return true;
            }
            return false;

        }


        public static void push(int data) {
            list.add(data);
        }

//        public static boolean isEmpty()
//        {
//
//
//        }
        public static int pop() {
            int data = list.get(list.size() - 1);
            list.remove(list.size() - 1);

            return data;
        }

        public static int peek()
        {
            return list.get(list.size() - 1);
        }



    }


    public static void main(String[] args)
    {
        stack s1 = new stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!(s1.isEmpty()))
        {
            System.out.print(s1.peek() + " ");
            s1.pop();


        }

//        System.out.println(s1.pop());

    }
}