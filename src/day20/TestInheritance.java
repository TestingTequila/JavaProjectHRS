package day20;

public class TestInheritance {
    public static void main(String[] args) {

        System.out.println("====Class A======");
        A a = new A();
        a.addition(12, 4);
        a.subtraction(12, 4);
        a.multiplication(12, 4);
        a.division(12, 4);

        System.out.println("====Class B======");
        B b = new B();
        b.addition(8, 2);
        b.subtraction(8, 2);
        b.multiplication(8, 2);
        b.division(8, 2);

        System.out.println("====Class C======");
        C c = new C();
        b.addition(16, 4);
        b.subtraction(16, 4);
        b.multiplication(16, 4);
        b.division(16, 4);

        System.out.println("====Class D======");
        D d = new D();
        d.addition(32, 2);
        d.subtraction(32, 2);
        d.multiplication(32, 2);
        d.division(32, 2);

        System.out.println("****************************************************************");

        System.out.println("====Class E======");
        E e = new E();
        e.addition(32, 2);
        e.subtraction(32, 2);
        e.multiplication(32, 2);
        e.division(32, 2);


        System.out.println("====Class F======");
        F f = new F();
        f.addition(32, 2);
        f.subtraction(32, 2);
        f.multiplication(32, 2);
        f.division(32, 2);

        System.out.println("====Class G======");
        G g = new G();
        g.addition(32, 2);
        g.subtraction(32, 2);
        g.multiplication(32, 2);
        g.division(32, 2);


        System.out.println("====Class H======");
        H h = new H();
        h.addition(32, 2);
        h.subtraction(32, 2);
        h.multiplication(32, 2);
        h.division(32, 2);

        System.out.println("=======Abstract Class================");

        //Base base =new Base(); We Cannot create object of an Abstract class
        //base.addition(12,4);

    }
}
