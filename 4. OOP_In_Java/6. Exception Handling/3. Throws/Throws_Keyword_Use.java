package OOP_In_Java;
import java.io.IOException;
import java.util.*;
public class Throws_Keyword_Use
{
    static class m
    {
        public static  void method() throws IOException
        {
            throw new IOException("IO Exception is thrown");
        }
    }

    public static void main(String[] args) {
        try
        {
            m  m1 = new m();
            m.method();
        }
        catch (Exception e)
        {
//            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
