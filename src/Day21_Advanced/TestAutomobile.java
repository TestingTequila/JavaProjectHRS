package Day21_Advanced;

public class TestAutomobile {
    public static void main(String[] args) {

        System.out.println("=================Vehicle=======================");

        Vehicle vehicle = new Vehicle();
        vehicle.isAutomatic();

        System.out.println("=================CAR=======================");

        Car car = new Car();
        car.start();
        car.stop();
        car.refuel();
        car.isAutomatic();
        Car.billing();// Car billing
        car.display();
        System.out.println(car.age); //45

        System.out.println("=================BMW=======================");

        BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
        bmw.refuel();
        bmw.isAutomatic();
        BMW.billing(); // BMW billing
        bmw.display();
        System.out.println(bmw.age);//55

        System.out.println("=================Vehicle & Car [P-C]=======================");

        Vehicle v1 = new Car(); // Top Casting
        v1.isAutomatic();

        Car car1 = new BMW();
        car1.start(); //BMW start
        car1.stop();   //car stop
        car1.refuel(); //car refuel
        car1.isAutomatic(); //BMW isAutomatic
        car1.billing(); //Car billing....
        car1.display();
        System.out.println(car1.age);//55[if overridden else 45]


        //BMW bmw1 = (BMW) new Car(); // DownCasting is not possible in Java:ClassCastException
        //DownCasting may be allowed at compile time but at runtime this will throw exception:  ClassCastException

    }
}
