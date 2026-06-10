package day18;

public class TestEcommerceApplication
{
    public static void main(String[] args) {
        EcommerceApplication eComm= new EcommerceApplication();
        eComm.login("Jason123", "test@1234");
        eComm.doSearch("Iphone");
        eComm.addToCart("Iphone");
        eComm.doPayment("23423423423", "456");
        eComm.generateId();
        eComm.logout();

        System.out.println("====using builder pattern============");

        EcommerceApplication ec= new EcommerceApplication();
        ec.login("tony546","test@1234").doSearch("MacBook").addToCart("MacBook").doPayment("deffered", "trest").generateId().logout();
        ec.login().logout();
        ec.login().doSearch("Laptop").addToCart("Laptop").logout();
    }
}
