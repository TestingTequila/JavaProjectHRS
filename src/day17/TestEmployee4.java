package day17;

public class TestEmployee4
{
    public static void main(String[] args) {
        Employee4 emp  = new Employee4("Kerrie", 5000, "ASD454645", "ASD467");

        System.out.println(emp.getName() + ", " + emp.getSalary() + ", " + emp.getAccountNumber()+ ", " + emp.getSSN());

        emp.setName("Roger");

        System.out.println(emp.getName() + ", " + emp.getSalary() + ", " + emp.getAccountNumber()+ ", " + emp.getSSN());

    }
}
