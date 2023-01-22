package domaci__19_01_2023;

public abstract class Ambalaza {

    protected String barkod;
    protected String naziv;
    protected double neto;
    protected double bruto;

//    constructors
    public Ambalaza(){

    }

    public Ambalaza(String barkod, String naziv, double neto, double bruto) {
        this.barkod = barkod;
        this.naziv = naziv;
        this.neto = neto;
        this.bruto = bruto;
    }

//    getters and setters


    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public double getBruto() {
        return bruto;
    }

    public void setBruto(double bruto) {
        this.bruto = bruto;
    }

//    METHODS
    public double tezinaPak(){
        return this.bruto - this.neto;
    }

    public abstract double cena();

    public abstract void stampaj();


}
