package day8;

public class TestEmployee {
    public static void main(String[] args) {
        Employee ep1 = new Employee();
        ep1.name = "Justin";
        ep1.age = 36;
        ep1.city = "NJ";
        ep1.actualSalary = 7000;
        ep1.expectedSalary = 12000;

        System.out.println(ep1.name + ", " + ep1.age + ", " + ep1.city + ", " + ep1.actualSalary + ", " + ep1.expectedSalary);

        System.out.println("=========================================================");

        Employee ep2 = new Employee();
        ep2.name = "Kerrie";
        ep2.age = 24;
        ep2.city = "NY";
        ep2.actualSalary = 3000;
        ep2.expectedSalary = 8000;
        System.out.println(ep2.name + ", " + ep2.age + ", " + ep2.city + ", " + ep2.actualSalary + ", " + ep2.expectedSalary);

    }
}
