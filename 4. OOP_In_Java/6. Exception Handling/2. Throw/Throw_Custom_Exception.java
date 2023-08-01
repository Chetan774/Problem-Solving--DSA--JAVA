package OOP_In_Java;

public class Throw_Custom_Exception
{
    public static class InvalidAgeException extends Exception
    {
        InvalidAgeException(String msg)
        {
            super(msg);
        }
    }

    public static void main(String[] args)
    {
       int age = 17;
        System.out.println("Age : "+ age);

       try {
           if(age < 18)
           {
               throw new InvalidAgeException("Your age is less than 18 You cant vote");
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
           System.out.println(e.getMessage());
       }
    }
}
