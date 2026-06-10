package day18;

public class Registration {
    String fName;
    String lName;
    int age;
    char gender;
    String pw;
    String cpw;
    String emailId;
    String state;
    String city;

    public Registration(String fName, String lName, int age, char gender, String pw, String cpw, String emailId, String state, String city) {
        this.fName = fName;
        this.age = age;
        this.lName = lName;
        this.gender = gender;
        this.pw = pw;
        this.cpw = cpw;
        this.emailId = emailId;
        this.state = state;
        this.city = city;

        System.out.println(fName);
        System.out.println(lName);
        System.out.println(state);
        System.out.println(city);
    }


    public Registration(String fName, String lName, int age, char gender, String pw, String cpw, String emailId) {
        this(fName, lName, age, gender, pw, cpw, emailId, "Ohio", "Ramada");
    }

    // we cannot call a constructor inside of a method
//    public  void m1()
//    {
//        this("", "", 32, 'F', "", "", "");
//    }
}
