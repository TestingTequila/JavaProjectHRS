package day8;

public class TestResume
{
    public static void main(String[] args) {

        Resume emp1 = new Resume();
        emp1.fName = "T";
        emp1.lName = "Hasham";
        emp1.age =34;
        emp1.gender = 'M';
        emp1.isOkWithWFH = false;

        System.out.println("EmpFName: " + emp1.fName);
        System.out.println("EmpLName: " + emp1.lName);
        System.out.println("EmpAge: " + emp1.age);
        System.out.println("EmpGender: " + emp1.gender);
        System.out.println("EmpWFH: " + emp1.isOkWithWFH);

        System.out.println("=========================================================");

        Resume emp2 = new Resume();
        emp2.fName = "W";
        emp2.lName = "Ruth";
        emp2.age = 30;
        emp2.gender = 'F';
        emp2.isOkWithWFH = true;

        System.out.println("EmpFName: " + emp2.fName);
        System.out.println("EmpLName: " + emp2.lName);
        System.out.println("EmpAge: " + emp2.age);
        System.out.println("EmpGender: " + emp2.gender);
        System.out.println("EmpWFH: " + emp2.isOkWithWFH);

        System.out.println("=========================================================");

        Resume emp3 = new Resume();
        emp3.fName = "James";
        emp3.lName = "Boxill";
        emp3.age =38;
        emp3.gender= 'M';
        emp3.isOkWithWFH = true;

        System.out.println("EmpFName: " + emp3.fName);
        System.out.println("EmpLName: " + emp3.lName);
        System.out.println("EmpAge: " + emp3.age);
        System.out.println("EmpGender: " + emp3.gender);
        System.out.println("EmpWFH: " + emp3.isOkWithWFH);

    }
}
