package day5;

public class SwitchStatement
{
    public static void main(String[] args) {

        String browserName = "IE";

        switch (browserName)
        {
            case "Chrome":
                System.out.println("Launch Chrome...");
                break;
            case "Firefox":
                System.out.println("Launch Firefox...");
                break;
            case "Edge":
                System.out.println("Launch Edge...");
                break;
            case "Safari":
                System.out.println("Launch Safari...");
                break;
            case "IE":
                System.out.println("Launch IE...");
                break;
            default:
                System.out.println("Invalid Browser Name...");
                break;

        }
    }
}
