package day9;

public class TestUser {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Ravi";
        u1.age = 32;
        u1.city = "Pune";

        User u2 = new User();
        u2.name = "Kerrie";
        u2.age = 29;
        u2.city = "NJ";


        User u3 = new User();
        u3.name = "Justin";
        u3.age = 42;
        u3.city = "NY";


        System.out.println(u1.name + ", " + u1.age + ", " + u1.city);
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city);
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city);


        System.out.println("******************u1=u2**********************");

        u1 = u2;// u1 will break its connection and point where u2 is pointing

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); //Kerrie
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); //Kerrie
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); //Justin

        System.out.println("******************u2=u3**********************");

        u2 = u3; //u2 will break its connection and point where u3 is pointing

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); //Kerrie
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); //Justin
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); //Justin

        System.out.println("******************u3=u1**********************");

        u3 = u1; //u3 will break its connection and point where u1 is pointing
        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); //Kerrie
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); //Justin
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); //Kerrie

        System.out.println("****************u1=u2=u3*********************");

        u1 = u2 = u3;
        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); //Kerrie
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); //Kerrie
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); //Kerrie

        System.out.println("================u4 Object====================");
        final  User u4 = new User();
        u4.name = "Ron";
        u4.age = 24;
        u4.city = "Jordan";

        System.out.println(u4.name + ", " + u4.age + ", " + u4.city); //Ron

       // u4=u3; any object with final keyword will be bound to the same object forever

        u3=u4;

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); //Kerrie
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); //Kerrie
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); //Ron
        System.out.println(u4.name + ", " + u4.age + ", " + u4.city); //Ron


    }
}
