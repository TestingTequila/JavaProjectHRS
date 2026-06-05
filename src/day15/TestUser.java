package day15;

public class TestUser {
    public static void main(String[] args) {
        User u1 = new User("Ashish", 32, "ashish@jb.com", "test@1234", "4543343");

        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.email);
        System.out.println(u1.password);
        System.out.println(u1.phone);

        System.out.println("=====================================");
        User u2 = new User("Tony", 22, "tony@jb.com", "test@234", "4543343565");
        System.out.println(u2.name);
        System.out.println(u2.age);
        System.out.println(u2.email);
        System.out.println(u2.password);
        System.out.println(u2.phone);
    }
}
