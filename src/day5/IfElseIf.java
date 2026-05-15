package day5;

public class IfElseIf {
    public static void main(String[] args) {

        int marks = 75;

        if(marks>=90)
        {
            System.out.println("Grade O");
        }
        else if (marks<80 && marks>70)
        {
            System.out.println("Grade A");
        }
        else if (marks>=70 && marks <60)
        {
            System.out.println("Grade B");
        }
        else if (marks>=60 && marks <50)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Grade F");
        }


        System.out.println("==================================================");

        String browserName = "IE";

        if(browserName.equals("Chrome"))
        {
            System.out.println("Execute TCs on Chrome Browser");
        }

        else if (browserName.equals("Edge"))
        {
            System.out.println("Execute TCs on Edge Browser");
        }

        else if (browserName.equals("Firefox"))
        {
            System.out.println("Execute TCs on Firefox Browser");
        }
        else if (browserName.equals("Safari"))
        {
            System.out.println("Execute TCs on Safari Browser");
        }
        else if (browserName.equals("IE"))
        {
            System.out.println("Execute TCs on IE Browser");
        }
        else
        {
            System.out.println("Not a valid browser name...");
        }


    }
}
