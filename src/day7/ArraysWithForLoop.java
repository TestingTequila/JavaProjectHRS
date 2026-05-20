package day7;

public class ArraysWithForLoop {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 56, 78, 93, 89, 95, 1, 55, 77, 88, 99, 11, 22, 33, 44};

        System.out.println("=====Using for loop=========");

        for (int i = 0;i < numbers.length;i++) {
            System.out.println(numbers[i]);

        }

        System.out.println("========================String Array==================");
        String[] students = {"Hasham", "Ruth", "James", "Tony", "Kerrie", "Mary", "Lee", "Ben"};

        System.out.println("=====Using for loop=========");

        for (int j = 0;j < students.length;j++) {
            System.out.println(students[j]);

        }


        System.out.println("==========char Array=============");
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("=====Using for loop=========");

        for (int k = 0;k < vowels.length;k++) {
            System.out.println(vowels[k]);

        }


    }
}
