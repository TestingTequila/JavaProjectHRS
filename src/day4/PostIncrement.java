package day4;

public class PostIncrement {
    public static void main(String[] args) {

        //1. POst Increment
        int a = 1;
        int b = a++;
        System.out.println(a);//2
        System.out.println(b);//1


        int c = 99;
        int d = c++;
        System.out.println(c); //100
        System.out.println(d); //99

        int e = 57;
        int f = e++;
        System.out.println(e);//58
        System.out.println(f);//57

        int g = -99;
        int h = g++;
        System.out.println(g);//-98
        System.out.println(h);//-99


        int i = 10;
        int j = i++;
        System.out.println(i);//11
        System.out.println(j);//10
    }
}
