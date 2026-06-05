package day15;

public class Administration
{
    public  Administration()
    {
        System.out.println("This is default constructor in Administration Class");
    }

    public  Administration(String s)
    {
        System.out.println("This is Constructor with String parameter : " + s);
    }

    public  Administration(int i)
    {
        System.out.println("This is Constructor with int parameter : " + i);
    }

    public  Administration(String s, int i)
    {
        System.out.println("This is Constructor with String & int parameter : " + s + ", " + i);
    }
}
