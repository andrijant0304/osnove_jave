package p__17_01_2023;

public abstract class Figura {

//    METHODS
    public abstract double povrsina();
    public abstract double obim();

    public void stampa(){
        System.out.println("Povrsina je: " + this.povrsina());
        System.out.println("Obim je: " + this.obim());
    }
}
