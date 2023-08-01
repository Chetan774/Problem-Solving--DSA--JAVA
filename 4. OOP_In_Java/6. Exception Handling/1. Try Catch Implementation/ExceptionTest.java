package OOP_In_Java;

public class ExceptionTest
{

    public static void main(String[] args) {
        int age = 19 ;

        try
        {
             age  = age / 0;

        }
        catch(Exception e)
        {
//            e.printStackTrace();
//            System.out.println();
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("I am in finally");
        }
    }
}
