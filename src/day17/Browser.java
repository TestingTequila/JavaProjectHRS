package day17;

public class Browser
{
    public  void launchBrowser()
    {
        System.out.println("Trying to Launch the browser....");
        checkRAM();
        checkVersion();
        checkBrowserServices();
        checkOS();

        System.out.println("Browser is launched...");
    }

    private  void  checkRAM()
    {
        System.out.println("Checking RAM....");
    }
    private  void  checkVersion()
    {
        System.out.println("Checking browser Version....");
    }

    private  void  checkOS()
    {
        System.out.println("Checking OS....");
    }

    private  void  checkBrowserServices()
    {
        System.out.println("Checking Browser Services....");
    }
}
