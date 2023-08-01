package Array;

public class Compile_Time_Ploymorphism_OverLoading
{
    static public class addition
    {
        public static int sum(int a, int b)
        {
            return a + b;
        }

        public static int sum(int a, int b, int c)
        {
            return a + b + c;
        }


        public static double sum(double a, double b)
        {
            //if we pass only one parameter double then other will be promoted to double

            return  (a + b);
        }


        public static void main(String[] args)
        {
            System.out.println("Method Overloading : "+"\n 1. by changing no of arguments " +
                    "\n 2. By changing data type of arguments ");
            addition oper  = new addition();
            System.out.println("two Arguments : "+oper.sum(10, 20));
            System.out.println("Three Arguments : "+oper.sum(10, 20, 30));
            System.out.println("Here a is promoted from int to double "+oper.sum(10, 20.30));
        }
    }
}
