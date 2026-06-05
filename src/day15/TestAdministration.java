package day15;

public class TestAdministration
{
    public static void main(String[] args) {
       Administration admin = new Administration(); // This is default constructor in Administration Class
       Administration admin2= new  Administration("Justin");//This is Constructor with String parameter : Justin

       Administration admin3 = new Administration(100); //This is Constructor with int parameter : " + 100

       Administration admin4= new Administration("Jason", 45); //This is Constructor with String & int parameter : Jason, 45
    }
}
