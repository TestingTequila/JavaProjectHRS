package day7;

public class ArraysConcepts {
    public static void main(String[] args) {

        //100;
        int x = 100;
        System.out.println(x);//100

        System.out.println("========================================================");

        //12, 34, 56, 78, 93
        int[] numbers = {12, 34, 56, 78, 93, 89, 95, 1, 55, 77, 88};

        System.out.println(numbers[0]); //12
        System.out.println(numbers[1]); //34
        System.out.println(numbers[2]); //56
        System.out.println(numbers[3]); //78
        System.out.println(numbers[4]); //93

        System.out.println("=========Count of values in an Arrays=================");

        System.out.println(numbers.length);//11
        //Li = numbers[0]
        //Hi = 11-1 = 10

        System.out.println("========================String Array==================");
        //Hasham, Ruth, James, Tony, Kerrie, Mary, Lee, Ben

        String[] students = {"Hasham", "Ruth", "James", "Tony", "Kerrie", "Mary", "Lee", "Ben"};
        //Li = students[0]
        //Hi = 8-1 = students[7]
        //size = 8

        System.out.println(students[0]); //Hasham
        System.out.println(students[1]); //Ruth
        System.out.println(students[2]); //James
        System.out.println(students[3]);//Tony
        System.out.println(students[4]);//Kerrie
        System.out.println(students[5]);//Mary
        System.out.println(students[6]);//Lee
        System.out.println(students[7]);//Ben


        System.out.println(students.length); //8


        System.out.println("==========char Array=============");

        //a,e,i,o,u

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println(vowels[0]); //a
        System.out.println(vowels[1]); //e
        System.out.println(vowels[2]); //i
        System.out.println(vowels[3]); //0
        System.out.println(vowels[4]); //u


    }
}
