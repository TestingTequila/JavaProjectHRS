package day18;

public class User
{
    private  String name;
    int age;
    String city;

    static double salary;

    public  User(String name, int age, String city)
    {
        this(city);
        System.out.println("City: "+ this.city);
        this.name = name;
        this.age= age;
        this.city = city;

        System.out.println("Name: " + this.city + "Age: " + this.age + "City: " + this.city);
    }

    public  User(String city)
    {
        this("NJ", 45);
        this.city = "Paris";
    }

    public  User(String city, int age)
    {
        this.city = "Paris";
    }
}
