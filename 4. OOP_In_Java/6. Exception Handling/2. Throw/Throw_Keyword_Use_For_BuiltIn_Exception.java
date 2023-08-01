package OOP_In_Java;

public class Throw_Keyword_Use_For_BuiltIn_Exception
{
    public static int divde(int x, int y)
    {
        if(y == 0)
        {
            throw new ArithmeticException("Cant divide by zero");
        }
        return x / y;
    }


    public static void main(String[] args) {
        try
        {
            divde(1, 0);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
