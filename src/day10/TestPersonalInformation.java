package day10;

public class TestPersonalInformation {
    public static void main(String[] args) {

        PersonalInformation pi = new PersonalInformation();
        pi.fName = "Justin";
        pi.mName = "K";
        pi.lName = "Wembley";

        pi.completeName1();
        //String name1=pi.completeName1(); //void

        String name2 =pi.completeName2();
    }
}
