package Array;

public class multilevel_Inheritance
{
    public static class Animal
    {
        public static void whomI()
        {
            System.out.println("I am animal");
        }
    }
    public static class dog extends Animal
    {
        public static void whomI()
        {
            System.out.println("I am dog");
        }
    }
    public static class Babydog extends dog
    {

    }


    public static void main(String[] args) {
        Babydog b = new Babydog();
        b.whomI();
    }
}
