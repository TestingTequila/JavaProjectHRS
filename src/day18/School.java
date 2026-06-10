package day18;

public class School
{
    public  void m1()
    {
        School.m4();
        System.out.println("m1 method");
    }

    public  void m2()
    {
        this.m2();
        System.out.println("m2 method");
    }

    public  void m3()
    {
        System.out.println("m3 method");
    }

    public static void m4()
    {
        System.out.println("m4 method");
    }

    public static void m5()
    {
        //this.m4();
        System.out.println("m5 method");
    }
    public static void m6()
    {
        School.m4();
        System.out.println("m6 method");
    }


}
