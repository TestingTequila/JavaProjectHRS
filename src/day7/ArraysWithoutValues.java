package day7;

public class ArraysWithoutValues {
    public static void main(String[] args) {
        // My every batch will have 5 students

        int x;
        x = 44;

        String[] names = new String[5];
        names[3] = "Ashish";
        names[0] = "Hasham";
        names[1] = "Ruth";
        names[2] = "James";
        names[4] = "Ron";
        //names[5] = "Justin";

        for (String n : names) {
            System.out.println(n);
        }

        System.out.println("===================================");

        int[] numbers = new int[10];
        for (int i : numbers) {
            System.out.println(i);
        }


        System.out.println("=========================================");

        String[] tabs = {"Home", "All-Access", "Courses", "Mentorship", "Career Accelarator", "Practice Apps"};

        for(String t :tabs)
        {
            System.out.println(t);
        }
    }
}
