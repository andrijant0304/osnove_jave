package p__17_01_2023;

public class JednakostranicniTrougao extends Figura{

    private int a;

//    constructors
    public JednakostranicniTrougao(int a) {
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
