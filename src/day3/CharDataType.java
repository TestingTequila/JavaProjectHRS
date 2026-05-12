package day3;

public class CharDataType {
    public static void main(String[] args) {

        char c1 = 'a';
        System.out.println(c1);

        char c2 = 'z';
        System.out.println(c2);

        char c3 = '0';
        char c4 = '9';
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c3 + c4);

        char c5 = '$';
        System.out.println(c5);

        char c6 = 'A';
        char c7 = 'Z';

        System.out.println("==================================================");

        char c11 = '1';
        char c22 = '2';
        System.out.println(c11 + c22);//50+49 => 99

        char c33 = 'a';
        char c44 = 'b';
        System.out.println(c33);//a
        System.out.println(c44);//b
        System.out.println(c33 + c44); //97+98 => 195

        char r1 = '0';
        char r2 = '9';
        System.out.println(r1); //0
        System.out.println(r2); //9

        System.out.println((int) r1);//48
        System.out.println((int) r2);//57
        System.out.println(r1 + r2); //48+57 =105
        System.out.println(r1 - r2); //48-59 = -9
        System.out.println(r1 * r2); //48*49 =2736

        System.out.println((int)'a');

        System.out.println("***********************************************");
        char u1 = 'a';
        char u2 = 'b';
        System.out.println(u1); //a
        System.out.println(u2); //b

        System.out.println((int)u1);//97
        System.out.println((int)u2);//98
        System.out.println((int)'a');//97
        System.out.println((int)'b');//98
        System.out.println(u1+u2); //97+98 = 195
        System.out.println('a' + 'b'); //97+98 = 195
        System.out.println((int)u1 +(int)u2); //97+98 = 195
        System.out.println(u1+0); // 97+ 0 = 97
        System.out.println((int)'0');
        System.out.println(u1+'0'); // 97+48  = 145
        System.out.println(u1 + 9); // 97 + 9= 106
        System.out.println(u1 + '9'); // 97 + 57 = 154

        System.out.println((char)97); //a
        System.out.println((char)98); //b


    }
}
