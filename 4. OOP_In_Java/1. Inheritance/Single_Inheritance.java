package Array;

public class Single_Inheritance
{
    static  class animal {
        int legs;
        int eyes;
        animal(int legs, int eyes)
        {
            this.legs = legs;
            this.eyes = eyes;

            System.out.println("Animal Constructor invoked");
            System.out.println("legs : "+ legs);
            System.out.println("eyes : "+ eyes);
        }
    }
    static class dog extends animal
    {
        boolean bark;

        dog(int legs, int eyes, boolean bark)
        {
            super(legs, eyes);
            this.bark = bark;
        }

         public static void bark(boolean bark)
         {
             if(bark)
             {
                 System.out.println("Dog barks");

             }
         }


    }


    public static void main(String[] args) {
        dog d = new dog(4, 2, true);
        d.bark(d.bark);
//        System.out.println();

    }
}
