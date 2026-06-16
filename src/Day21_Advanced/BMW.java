package Day21_Advanced;

public class BMW extends Car
{

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

    //cannot be overridden as this is final in its parent class
//    public final void floodLights()
//    {
//        System.out.println("Vehicle Flood Lights...");
//    }
}
