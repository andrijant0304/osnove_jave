package p__19_01_2023;

public abstract class Atleticar {

    private String imeIprezime;
    protected double rezultat;

//    constructors
    public Atleticar() {
    }

    public Atleticar(String imeIprezime, double rezultat) {
        this.imeIprezime = imeIprezime;
        this.rezultat = rezultat;
    }

//    getters and setters


    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }

    //    METHODS
    public abstract boolean daLiJeBolji(Atleticar a);

    public void stampa(){
        System.out.println("Atleticar: " + this.imeIprezime + ", " + this.rezultat);
    }
}
