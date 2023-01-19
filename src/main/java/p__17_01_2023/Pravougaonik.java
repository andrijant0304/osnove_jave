package p__17_01_2023;

public class Pravougaonik extends Figura{

    private int a;
    private int b;

//    constructors

    public Pravougaonik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //    getters and setters
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

    //    METHODS
    @Override
    public double povrsina() {
        return this.a * this.b;
    }

    @Override
    public double obim() {
        return (this.a + this.b) * 2;
    }
}
