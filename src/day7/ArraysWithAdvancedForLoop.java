package day7;

public class ArraysWithAdvancedForLoop {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 56, 78, 93, 89, 95, 1, 55, 77, 88, 99, 11, 22, 33, 44};

        System.out.println("=====Using advanced for loop=========");

        for(int n :numbers)
        {
            if(n==99)
            {

            }
            else {
                System.out.println(n);
            }
        }


        System.out.println("========================String Array==================");
        String[] students = {"Hasham", "Ruth", "James", "Tony", "Kerrie", "Mary", "Lee", "Ben"};

        System.out.println("=====Using advanced for loop=========");
        for(String s :students)
        {
            System.out.println(s);
        }




        System.out.println("==========char Array=============");
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("=====Using advanced for loop=========");

        for(char v :vowels)
        {
            System.out.println(v);
        }



    }
}
