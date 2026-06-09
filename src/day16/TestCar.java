package day16;

public class TestCar
{
    public static void main(String[] args) {
//        Car car = new Car();
//        car.name = "Audi";
//        car.color = "Black";
//        car.price = 56756756;
//        car.isAutomatic = true;

//        Car car1 = new Car();
//        car1.name = "AlphaRomeo";
//        car1.color = "Red";
//        car1.price =565464;
//        car1.isAutomatic =false;


         //Setting the value of global Variables
         Car car = new Car("Audi", "Black",56756756, true );
         //Getting the value
         System.out.println(car.name +", " + car.color+", " + car.price +", " + car.isAutomatic);


         Car car1= new Car("AlphaRomeo", "Red", 565464, false);
        System.out.println(car1.name +", " + car1.color+", " + car1.price +", " + car1.isAutomatic);
    }
}
