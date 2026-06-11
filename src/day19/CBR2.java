package day19;

public class CBR2 {
    private int a;
    private int b;

    public CBR2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void updateValue(CBR2 cbr) {
        cbr.setA(100);
        cbr.setB(500);
    }
}
