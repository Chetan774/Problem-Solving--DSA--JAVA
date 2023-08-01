package OOP_In_Java;


class newThread implements Runnable
{
    public void run()
    {
        System.out.println("Thread Created Using Runnable Interface");
    }
}
public class Thread_Created_By_Implementing_Runnable_Interface
{
    public static void main(String[] args)
    {
         newThread t = new  newThread();

         Thread th =  new Thread(t);
         th.start();
    }
}
