package OOP_In_Java;

 abstract class Person
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public abstract void displayInfo();

}

 class Faculty extends Person
 {
    private String department;

    public Faculty(String name, int age, String department)
    {
        super(name, age);
        this.department = department;
    }

    public void displayInfo()
    {
        System.out.println("I am a faculty member in the "
                + department + " department.");
    }
}

 class Student extends Person
 {
    private int rollNumber;

    public Student(String name, int age, int rollNumber)
    {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public void displayInfo()
    {
        System.out.println("I am a student with roll number "
                         + rollNumber + ".");
    }
}

public class Abstraction
{
        public static void main(String[] args)
        {
            Faculty faculty = new Faculty("John Doe", 40, "Computer Science");
            Student student = new Student("Jane Smith", 22, 12345);

            faculty.displayInfo();

            student.displayInfo();
        }

}
