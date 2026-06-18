package Day21_Advanced;

public class Car extends Vehicle {

    int age = 45;

    public void start() {
        System.out.println("Car Start.....");
    }

    public void stop() {
        System.out.println("Car Stop.....");
    }

    public void refuel() {
        System.out.println("Car refuel.....");
    }

    public static void billing() {
        System.out.println("Car billing.....");
    }

    public final void display() {
        System.out.println("Car display.....");
    }

    public static final void running() {
        System.out.println("Car display.....");
    }


}
