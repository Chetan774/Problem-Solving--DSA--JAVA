package Array;

public class Runtime_polymorphsim_Overriding
{
    //Dynamic methid dispatch

    public static class Animal
    {
        public static void run()
        {
            System.out.println("Animal running");
        }
    }
    public static class dog extends Animal
    {
        public static void run()
        {
            System.out.println("dog running");
        }
    }
    public static class cat extends Animal
    {
        public static void run()
        {
            System.out.println("Cat running");
        }
    }

    public static void main(String[] args) {
        dog d = new dog();
        d.run();
        cat c = new cat();
        c.run();
        Animal a = new Animal();
        a.run();

    }



}
