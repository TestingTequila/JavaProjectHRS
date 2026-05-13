package day4;

public class StringConcatenation {
    public static void main(String[] args) {
        String x = "Hello";
        String y = "World";

        int a = 100;
        int b = 200;

        System.out.println(x); //Hello
        System.out.println(y); //World
        System.out.println(a); //100
        System.out.println(b); //200


        System.out.println(x + y);//HelloWorld
        System.out.println(a + b);//300

        System.out.println(x + a); // Hello+100 => Hello100
        System.out.println(a + b + x + y);//300HelloWorld
        System.out.println(x + y + a + b); //HelloWorld100200
        System.out.println(a + b + x + y + a + b);//300HelloWorld100200
        System.out.println(x + y + (a + b)); //HelloWorld300
        System.out.println(x + y + a + b + (a + b));//HelloWorld100200300

        int z = 300;
        System.out.println("The value of z is " + z); //The value of z is 300
        System.out.println("The sum of a and b is : " + a + b); //The sum of a and b is 100200
        System.out.println("The sum of a and b is : " + (a + b)); //The sum of a and b is 300
    }


}
