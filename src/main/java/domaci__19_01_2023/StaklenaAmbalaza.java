package domaci__19_01_2023;

public class StaklenaAmbalaza extends Ambalaza{

    private double kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCenaStakl;
//    constructors
    public StaklenaAmbalaza(){
    }

    public StaklenaAmbalaza(String barkod, String naziv, double neto, double bruto, double kaucija, boolean daLiSePlacaKaucija, double osnovnaCenaStakl) {
        super(barkod, naziv, neto, bruto);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCenaStakl = osnovnaCenaStakl;
    }

    //    getters and setters
    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public double getOsnovnaCenaStakl() {
        return osnovnaCenaStakl;
    }

    public void setOsnovnaCenaStakl(double osnovnaCenaStakl) {
        this.osnovnaCenaStakl = osnovnaCenaStakl;
    }

    //    METHODS
    @Override
    public double cena() {
        if (daLiSePlacaKaucija){
            return this.osnovnaCenaStakl * 1.2 + this.kaucija;
        }
        return this.osnovnaCenaStakl * 1.2;
    }

    @Override
    public void stampaj() {
        System.out.println("Artikal: " + this.naziv);
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Neto tezina: " + this.neto);
        System.out.println("Bruto tezina: " + this.bruto);
        System.out.print("Kaucija: ");
        if (this.daLiSePlacaKaucija){
            System.out.println(this.kaucija);
        } else {
            System.out.println(0);
        }
        System.out.println("Artikal: " + this.naziv);
        System.out.println("Cena: " + this.osnovnaCenaStakl);
        System.out.println();

    }
}

