package ARRAY;

import java.util.Stack;

public class Stack_Using_Collections
{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!(s.isEmpty()))
        {
//            System.out.println();
            System.out.println(s.peek());
            s.pop();
        }

        System.out.println(s.pop());
    }
}
