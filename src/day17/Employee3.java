package day17;

public class Employee3 {
    private String name;
    private int salary;
    private String AccountNumber;
    private String SSN;

    //Setting the value
    public Employee3(String name, int salary, String AccountNumber, String SSN) {
        this.name = name;
        this.salary = salary;
        this.AccountNumber = AccountNumber;
        this.SSN = SSN;
    }

    //Get the values


    public String getName() {
        return name;
    }

    public int getSalary() {
        int mySalary = 0;
        if (salary > 2000 && salary < 6000) {
            mySalary = salary;
        } else {
            mySalary = 0;
        }
        return mySalary;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public String getSSN() {
        return SSN;
    }
}
