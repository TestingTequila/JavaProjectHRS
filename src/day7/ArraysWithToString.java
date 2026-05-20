package day7;

import java.util.Arrays;

public class ArraysWithToString {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 56, 78, 93, 89, 95, 1, 55, 77, 88, 99, 11, 22, 33, 44};

        System.out.println("=====Using .toString() =========");

        System.out.println(Arrays.toString(numbers));

        System.out.println("========================String Array==================");
        String[] students = {"Hasham", "Ruth", "James", "Tony", "Kerrie", "Mary", "Lee", "Ben"};
        System.out.println("=====Using .toString()=========");
        System.out.println(Arrays.toString(students));


        System.out.println("==========char Array=============");
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("=====Using .toString()=========");
        System.out.println(Arrays.toString(vowels));


    }
}
