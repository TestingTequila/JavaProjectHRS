package day17;

public class Employee4 {
    private String name;
    private int salary;
    private String AccountNumber;
    private String SSN;

    public Employee4(String name, int salary, String accountNumber, String SSN) {
        this.name = name;
        this.salary = salary;
        AccountNumber = accountNumber;
        this.SSN = SSN;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public String getSSN() {
        return SSN;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
}
