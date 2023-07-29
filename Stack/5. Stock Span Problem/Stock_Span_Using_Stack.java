package ARRAY.Medium;
import java.util.*;
public class Stock_Span_Using_Stack
{

    public static void countSpan(int stocks[],int span[])
    {
        Stack<Integer> s = new Stack<>();

        span[0] = 1;
        s.push(0);

        for(int i = 1; i < stocks.length;i++)
        {
            int currElement = stocks[i];

            while (!s.isEmpty() && currElement > stocks[s.peek()] )
            {
                s.pop();
            }

            if(s.isEmpty())
            {
                span[i]  = i + 1;
            }
            else
            {
                int prevHigh  = s.peek();

                span[i] = i - prevHigh;
            }

          s.push(i);
        }


    }


    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};

        int span[] = new int[stocks.length];

        countSpan(stocks,span);

        System.out.println(Arrays.toString(span));
    }
}