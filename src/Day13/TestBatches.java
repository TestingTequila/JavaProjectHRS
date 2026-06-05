package Day13;

public class TestBatches {
    public static void main(String[] args) {
        Batches batch1 = new Batches();
        batch1.numberOfStudents = 40;
        batch1.averageAge = 21;
        batch1.city = "NJ";

        System.out.println(batch1.numberOfStudents);
        System.out.println(batch1.averageAge);
        System.out.println(batch1.city);
        System.out.println(Batches.trainersName); // static should bee called using the class name to which this belongs

    }
}
