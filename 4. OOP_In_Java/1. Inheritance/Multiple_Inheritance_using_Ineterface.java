package OOP_In_Java;

public class Multiple_Inheritance_using_Ineterface
{
    interface  A
    {
        abstract int sum(int x, int y);
    }
    interface B
    {
        abstract int sum(int x, int y);
    }

    static public class c implements A, B
    {

      public int sum(int x, int y)
      {
          return x + y;
      }


    }

    public static void main(String[] args) {
        c a = new c();

        System.out.println(a.sum(10,20));

//        System.out.println(a.sum(10,20,30));

    }

}
