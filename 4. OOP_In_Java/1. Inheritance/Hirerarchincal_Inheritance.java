package Array.Easy;

public class Hirerarchincal_Inheritance
{
    public  static class Animal
    {

    }
    public static class dog extends Animal
    {

    }
    public static class cat extends Animal
    {
        cat()
        {
            System.out.println("Mau Mau");
        }
    }

    public static void main(String[] args) {

        System.out.println("cat and dog both inheriting Animal");


    }
}
