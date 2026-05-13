package day4;

public class MathOperations {
    public static void main(String[] args) {

        // I/I = I part
        System.out.println(10 / 2); //5
        System.out.println(9 / 2);  //4

        // D/I or I/D or D/D = I + Decimal part

        System.out.println(10 / 2.0); //5.0
        System.out.println(9.0 / 2);  //4.5
        System.out.println(9 / 2.0);  //4.5
        System.out.println(9.0 / 2.0);//4.5

        //Misc

        int a = 10;
        int b = 2;
        int c = 3;

        System.out.println(a / c);//3

        int sum = a / c;
        System.out.println(sum);//3


        double add = a / c; //3.0
        System.out.println(add);//3.0

        //Modulo Operator - Remainder

        System.out.println(10 % 2); //0
        System.out.println(10 % 3); //1

        System.out.println(9.2 % 2);
    }
}
