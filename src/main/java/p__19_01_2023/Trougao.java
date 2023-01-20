package p__19_01_2023;

public class Trougao extends Figura{


    private int a;

    //    constructors
    public Trougao(int a) {
        this.a = a;
    }

    //    getters and setters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }


    //METHODS
    @Override
    public double povrsina() {
        return (this.a * this.a) * 1.73;
    }

    @Override
    public double obim() {
        return a * 3;
    }
}
