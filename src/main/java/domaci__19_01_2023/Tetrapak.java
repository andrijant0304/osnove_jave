package domaci__19_01_2023;

public class Tetrapak extends Ambalaza{

    private boolean reciklazno;
    private double osnovnaCena;

//    constructors
    public Tetrapak(){

    }


    public Tetrapak(String barkod, String naziv, double neto, double bruto, boolean reciklazno, double osnovnaCena) {
        super(barkod, naziv, neto, bruto);
        this.reciklazno = reciklazno;
        this.osnovnaCena = osnovnaCena;
    }

//    getters and setters

    public boolean isRecikliranje() {
        return reciklazno;
    }

    public void setRecikliranje(boolean reciklazno) {
        this.reciklazno = reciklazno;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

//    METHODS
    @Override
    public double cena() {
        if (this.reciklazno){
            return this.tezinaPak() * 1.5 + this.osnovnaCena;
        }
        return this.osnovnaCena;
    }

    @Override
    public void stampaj() {
        System.out.println("Artikal: " + this.naziv);
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Neto tezina: " + this.neto);
        System.out.println("Bruto tezina: " + this.bruto);
        System.out.print("Reciklira se: ");
        if (this.reciklazno){
            System.out.println("Da");
        } else {
            System.out.println("Ne");
        }
        System.out.println("Artikal: " + this.naziv);
        System.out.println("Cena: " + this.osnovnaCena);
    }


}
