package day10;

public class TestMaths {
    public static void main(String[] args) {

        Maths math = new Maths();
        math.a = 10;
        math.b = 5;
        math.addition1();

        //int sum1 =math.addition1(); //void

        int sum2 =math.addition2(); //int
        System.out.println(sum2*5);

    }
}
