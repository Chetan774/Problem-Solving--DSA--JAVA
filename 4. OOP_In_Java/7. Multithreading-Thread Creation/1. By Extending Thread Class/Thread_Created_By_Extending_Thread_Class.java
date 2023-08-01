package OOP_In_Java;

class testThread extends Thread
{
    public void run()
    {
        System.out.println("Thread Created");
    }
}
public class Thread_Created_By_Extending_Thread_Class
{


    public static void main(String[] args)
    {
        testThread t1 = new testThread();
        testThread t2 = new testThread();
        t1.start();
        t2.start();

        System.out.println("Name Of Thread 1 is : "+t1.getName());
        System.out.println("Is T1 alive : "+ t1.isAlive());
        System.out.println("t1 id : "+t1.getId());
        System.out.println("t2 id : "+t2.getId());
        System.out.println("Name Of Thread  2 is : "+t2.getName());
    }

}
