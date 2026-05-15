package day5;

public class MultipleIfStatement
{
    public static void main(String[] args) {

        String browserName = "IE";

        if(browserName.equals("Chrome"))
        {
            System.out.println("Launch Chrome Browser...");
        }
        if(browserName.equals("Edge"))
        {
            System.out.println("Launch Edge Browser...");
        }
        if(browserName.equals("Firefox"))
        {
            System.out.println("Launch Firefox Browser...");
        }
        if(browserName.equals("IE"))
        {
            System.out.println("Launch IE Browser...");
        }
        else
        {
            System.out.println("Invalid browser Name...");
        }
    }
}
