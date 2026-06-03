package day12;

public class Test
{
    public static void main(String[] args) {
        System.out.println("This is the default main method...");
    }

    public static void main(String[] args, String s) {
        System.out.println("This is the main method with String array and string signature...");
    }

    public static void main(String args, String s) {
        System.out.println("This is the main method with String and string signature...");

    }

    public static void main(String args, String[] s) {
        System.out.println("This is the main method with String and string array signature...");
    }
}
