package day17;

public class TestEmployee
{
    public static void main(String[] args) {
        Employee emp1= new Employee();
        emp1.setName("Justin");
        emp1.setSalary(7000);
        emp1.setAccountNumber("456564564");
        emp1.setSSN("ASG65HFG2");


        System.out.println(emp1.getName() + ", " + emp1.getSalary() + ", " + emp1.getAccountNumber()+ ", " + emp1.getSSN());


    }
}
