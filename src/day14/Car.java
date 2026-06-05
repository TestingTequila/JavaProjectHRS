package day14;

public class Car
{
    public  Car()
    {

    }
    String name;
    int price;
    String color;
    final static int wheels=4;

    public  void start()
    {
        System.out.println("Car---- Start");
        int enginePower=450;
        System.out.println(enginePower);
    }

    public static  void speedTest()
    {
        System.out.println("Car ---speed Test");
    }

    public static  void speedTest(int size)
    {
        System.out.println("Car ---speed Test");
    }
}
