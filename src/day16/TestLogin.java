package day16;

public class TestLogin {
    public static void main(String[] args) {
        Login log = new Login("admin@janbask.com", "admin123");

        if(log.doLogin())
        {
            System.out.println("Please display the Menu Items....");
        }
        else
        {
            System.out.println("Login failed, please check your credentials..");
        }
    }
}
