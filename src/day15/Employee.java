package day15;

public class Employee {
    String empName;
    int age;
    String city;
    char gender;


    public Employee() {
        System.out.println("This is the constructor of Employee Class");
        empName = "Justin";
        age = 21;
        city = "NY";
        gender = 'm';
    }

    public  void m1()
    {
        System.out.println("This is m1 method within class Employee");
    }
}
