package day11;

public class TestStudents {
    public static void main(String[] args) {
        Students stud1 = new Students();
        stud1.setfName("Ritu");
        stud1.setlName("Roger");
        stud1.setAge(21);
        stud1.setCity("NY");
        stud1.setGender('M');

        System.out.println(stud1.getfName() + " " + stud1.getlName());
        System.out.println(stud1.getAge());
        System.out.println(stud1.getCity());
        System.out.println(stud1.getGender());

        if(stud1.getAge()>=18)
        {
            System.out.println("Student can vote...");
        }
        else
        {
            System.out.println("Student can't Vote ....");
        }


    }
}
