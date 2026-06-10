package day18;

public class EcommerceApplication
{
    public EcommerceApplication login()
    {
        System.out.println("Login to Application....");
        return this;
    }

    public EcommerceApplication login(String un, String pw)
    {
        System.out.println("Login to Application...." + un + ", " + pw);
        return this;
    }

    public  EcommerceApplication doSearch(String productName)
    {
        System.out.println("Searching product: " + productName);
        return this;
    }

    public  EcommerceApplication doSearch(String productName, int price)
    {
        System.out.println("Searching product: " + productName + ", " + price);
        return this;
    }

    public  EcommerceApplication doSearch(String productName, int price, String brand)
    {
        System.out.println("Searching product: " + productName + ", " + price + ", " + brand);
        return this;
    }

    public  EcommerceApplication addToCart(String productName)
    {
        System.out.println("Adding to Cart: " + productName);
        return this;
    }

    public  EcommerceApplication doPayment(String cryptos)
    {
        System.out.println("making payment: " + cryptos);
        return this;
    }
    public  EcommerceApplication doPayment(String payPal, String password)
    {
        System.out.println("making payment: " + payPal + ", " + password);
        return this;
    }

    public  EcommerceApplication doPayment(String CCNumber, int cvv)
    {
        System.out.println("making payment: " + CCNumber + ", " + cvv);
        return this;
    }

    public  EcommerceApplication generateId()
    {
        System.out.println("Generate Id: " + 123213);
        return this;
    }

    public EcommerceApplication logout()
    {
        System.out.println("Logout...");
        return this;
    }
}
