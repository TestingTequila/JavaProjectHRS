package Day21_Advanced;

public class BMW extends Car
{

    int age = 55;

    @Override
    public  void start()
    {
        System.out.println("BMW  Start.....");
    }

    public  void autoParking()
    {
        System.out.println("BMW AutoParking....");
    }

    @Override
    public  void isAutomatic()
    {
        System.out.println("BMW isAutomatic....");
    }


    public static void billing() {
        System.out.println("BMW billing.....");
    }

    // cannot override a method with final keyword
//    public final void display() {
//        System.out.println("Car display.....");
//    }

    //cannot be overridden as this is final in its parent class
//    public final void floodLights()
//    {
//        System.out.println("Vehicle Flood Lights...");
//    }

    // cannot override method with final+static keyword

//    public static final void running() {
//        System.out.println("Car display.....");
//    }
}
