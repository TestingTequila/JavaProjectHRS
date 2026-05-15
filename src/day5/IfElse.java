package day5;

public class IfElse {
    public static void main(String[] args) {

        int age = 16;
        //System.out.println(age<=20);//true

        if (age>=18)
        {
            System.out.println("The person is eligible to Vote...");
        }
        else
        {
            System.out.println("The person is not eligible to Vote...");
        }


        System.out.println("===========================================");

        String pageTitle = "Tinder";

        if(pageTitle.equals("Facebook"))
        {
            System.out.println("We are on Facebook Login Page");
        }
        else
        {
            System.out.println("We are not on Facebook Login Page");
        }


    }
}
