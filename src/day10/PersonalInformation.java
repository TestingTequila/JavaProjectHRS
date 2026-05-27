package day10;

public class PersonalInformation {
    // WAP to print full name of a person [firstName, middleName, LastName]

    String fName;
    String mName;
    String lName;

    private String SSN;
    private int atmPIN;

    public void completeName1() {

        String fullName = fName + " " + mName + " " + lName;
        System.out.println("Complete Name of Employee is: " + fullName);
    }

    public String completeName2() {

        String fullName = fName + " " + mName + " " + lName;
        System.out.println("Complete Name of Employee is: " + fullName);
        return fullName;
    }
}



