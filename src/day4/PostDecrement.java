package day4;

public class PostDecrement {
    public static void main(String[] args) {

        //1. POst Decrement
        int a = 1;
        int b = a--;
        System.out.println(a);//0
        System.out.println(b);//1


        int c = 99;
        int d = c--;
        System.out.println(c); //98
        System.out.println(d); //99

        int e = 57;
        int f = e--;
        System.out.println(e);//56
        System.out.println(f);//57

        int g = -99;
        int h = g--;
        System.out.println(g);//-100
        System.out.println(h);//-99


        int i = 10;
        int j = i--;
        System.out.println(i);//9
        System.out.println(j);//10
    }
}
