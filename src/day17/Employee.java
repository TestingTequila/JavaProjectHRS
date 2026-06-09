package day17;

public class Employee
{
    private String name;
    private int salary;
    private String AccountNumber;
    private String  SSN;

    public  void setName(String name)
    {
        this.name = name;
    }

    public  void setSalary(int salary)
    {
        if(salary>2000 && salary< 6500)
        {
            this.salary = salary;
        }
        else {
            System.out.println("Invalid Salary...Please check");
        }
    }

    public  void  setAccountNumber(String accountNumber)
    {
        this.AccountNumber = accountNumber;
    }

    public  void  setSSN(String SSN)
    {
        this.SSN = SSN;

    }

    public  String getName()
    {
        return name;
    }

    public  int getSalary()
    {
        return salary;
    }

    public  String getAccountNumber()
    {
        return AccountNumber;
    }

    public  String getSSN()
    {
        return SSN;
    }
}
