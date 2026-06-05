package day14;

public class Scenarios
{
    public Scenarios()
    {

    }
    public  void m1()
    {
        System.out.println("m1 method - NonStatic");
        Scenarios.m4();
    }

    public  void m2()
    {
        Scenarios scene1= new Scenarios();
        System.out.println("m2 method - NonStatic");
        scene1.m1();
    }

    public static void m3()
    {
        Scenarios scene2= new Scenarios();
        System.out.println("m3 method - Static");
        scene2.m1();
    }

    public static void m4()
    {
        Scenarios.m3();
        System.out.println("m4 method - Static");
    }
}
