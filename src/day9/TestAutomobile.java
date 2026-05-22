package day9;

public class TestAutomobile {
    public static void main(String[] args) {
        Automobile auto1 = new Automobile(); //Heap Memory
        auto1.brandName = "Chrysler";
        auto1.modelName = "Daxin657";
        auto1.chasisNumber = 987668;
        auto1.isAutomatic = true;

        System.out.println(auto1.brandName);
        System.out.println(auto1.modelName);
        System.out.println(auto1.chasisNumber);
        System.out.println(auto1.isAutomatic);

        System.out.println("************************auto1=null*******************");
        auto1 = null;

        System.out.println(auto1.brandName);
        System.out.println(auto1.modelName);
        System.out.println(auto1.chasisNumber);
        System.out.println(auto1.isAutomatic);

        System.out.println("*****************NoReferenceObject***********************");

        new Automobile().brandName = "AlphaRomeo";
        new Automobile().brandName = "Geot3456";
        new Automobile().chasisNumber = 6789;
        new Automobile().isAutomatic = false;

        System.out.println("==========================================================");

        Automobile auto2 = new Automobile();
        auto2.brandName = "Dodge";
        auto2.modelName = "BHR45TY";
        auto2.chasisNumber = 76876;
        auto2.isAutomatic = true;


         Automobile auto3=new Automobile();

         System.gc();

    }
}
