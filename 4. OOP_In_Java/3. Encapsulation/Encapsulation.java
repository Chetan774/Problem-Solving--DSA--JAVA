package OOP_In_Java;

public class Encapsulation
{
    static public class student
    {
        private String name;
        private int roll_no;
        private int age;

        student(String name, int roll_no, int age)
        {
            this.name = name;
            this.roll_no = roll_no;
            this.age  = age;
        }

        public void SetAge(int age)
        {
            this.age = age;
        }
        public void SetName(String name)
        {
            this.name = name;
        }

        public void SetRollNo(int roll_no)
        {
            this.roll_no = roll_no;
        }

        public int getAge()
        {
            return age;
        }
        public String getName()
        {
            return name;
        }
        public int getRollNo()
        {
            return roll_no;
        }

    }

        public static void main(String[] args) {
            student s = new student("Chetan", 1, 20);

            System.out.println("using getters to acces values ");
            System.out.println();
            System.out.println("Age : "+s.getAge());
            System.out.println("Name : " +s.getName());
            System.out.println("Roll No : "+s.getRollNo());


            System.out.println("Using seters to change values : ");
            System.out.println();

            s.SetName("New Name");
            s.SetRollNo(2);
            s.SetAge(21);

            System.out.println("Changed values ");
            System.out.println();

            System.out.println("Age : "+s.getAge());
            System.out.println("Name : " +s.getName());
            System.out.println("Roll No : "+s.getRollNo());






        }



}
