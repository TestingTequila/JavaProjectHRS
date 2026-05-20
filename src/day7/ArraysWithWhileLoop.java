package day7;

public class ArraysWithWhileLoop {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 56, 78, 93, 89, 95, 1, 55, 77, 88, 99, 11, 22, 33, 44};

        System.out.println("=====Using while loop=========");
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println("========================String Array==================");
        String[] students = {"Hasham", "Ruth", "James", "Tony", "Kerrie", "Mary", "Lee", "Ben"};

        System.out.println("=====Using while loop=========");
        int j = 0;
        while (j < students.length) {
            System.out.println(students[j]);
            j++;
        }


        System.out.println("==========char Array=============");
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("=====Using while loop=========");
        int k = 0;
        while (k < vowels.length) {
            System.out.println(vowels[k]);
            k++;
        }

        System.out.println("Printing in reverse order");

        int l = vowels.length-1;

        while (l>=0)
        {
            System.out.println(vowels[l]);
            l--;
        }


    }
}
