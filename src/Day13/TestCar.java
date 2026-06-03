package Day13;

public class TestCar {
    public static void main(String[] args) {

        System.out.println("=====c1======");
        Car c1 = new Car();
        c1.name = "BMW";
        c1.price = 9000;
        c1.color = "Red";
        System.out.println(c1.name);
        System.out.println(c1.color);
        System.out.println(c1.price);
        System.out.println(Car.wheels);

        System.out.println("=====c2======");

        Car c2 = new Car();
        c2.name = "Audi";
        c2.price = 8000;
        c2.color = "White";
        System.out.println(c2.name);
        System.out.println(c2.color);
        System.out.println(c2.price);
        System.out.println(Car.wheels);

        System.out.println("=====c3======");


        Car c3 = new Car();
        c3.name = "Tesla";
        c3.price = 10000;
        c3.color = "Blue";
        System.out.println(c3.name);
        System.out.println(c3.color);
        System.out.println(c3.price);
        System.out.println(Car.wheels);

    }
}
