package day15;

public class School
{
    public School(String schoolName, String city) {
        this.schoolName = schoolName;
        this.city = city;
    }

    public School(String city, int studentsCount) {
        this.city = city;
        this.studentsCount = studentsCount;
    }

    public School(String schoolName, String city, int studentsCount) {
        this.schoolName = schoolName;
        this.city = city;
        this.studentsCount = studentsCount;
    }

    String schoolName;
    String city;
    int studentsCount;



}
