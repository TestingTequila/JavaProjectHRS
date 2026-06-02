package day11;

public class Students {
    private String fName;
    private String lName;
    private int age;
    private String city;
    private char gender;

    public void setfName(String fName) {

        if (fName.equals("Jason")) {
            this.fName = fName;
        } else {
            this.fName = "N/A";
        }
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public char getGender() {
        return gender;
    }
}
