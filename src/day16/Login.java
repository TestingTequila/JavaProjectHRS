package day16;

public class Login
{
    String username;
    String password;

    public  Login(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public boolean doLogin()
    {
        System.out.println("Enter UserName: " + username);
        System.out.println("Enter Password: " + password);
        System.out.println("Click On Login Button....");
        System.out.println("User is Logged in....");
        return true;
    }
}
