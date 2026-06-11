package day20;

public abstract class Base
{
    public abstract void addition(int a, int b);

    public void subtraction(int a, int b)
    {
        int diff =a-b;
        System.out.println("Subtraction in class A: " + diff);
    }

    public void multiplication(int a, int b)
    {
        int product =a*b;
        System.out.println("Multiplication in class A: " + product);
    }

    public void division(int a, int b)
    {
        int divide =a/b;
        System.out.println("Division in class A: " + divide);
    }
}
