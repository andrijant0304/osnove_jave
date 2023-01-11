package domaci_10_01_2023;

public class Proizvod {

    private String naziv;
    private Kupac musterija;
    private double cenaIzrade;

    public Proizvod(String naziv, double cenaIzrade) {
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kupac getMusterija() {
        return musterija;
    }

    public void setMusterija(Kupac musterija) {
        this.musterija = musterija;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public  double cenaProizvoda(){
        return this.cenaIzrade * 1.9 * (100) / 100;
    }

    public void stampajProizvod(){
        System.out.println("Proizvod: " + this.naziv + " - " + this.cenaProizvoda());
        System.out.println("Kupac: ");  //ime i prezime - broj kartice
    }
}

//Zadatak (POGLEDAJ SLIKU)
//Kreirati klasu Proizvod koja ima
//●	Naziv proizvoda
//●	kupca/musteriju
//●	cenu izrade proizvoda
//●	gettere i settere
//●	konstruktore
//●	Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//●	Metodu za stampanje proizvoda u formatu:
//naziv proizvoda - cena
//ime i prezime - broj kartice
//
//Kreirati klasu Kupac koja ima:
//●	ime i prezime
//●	clansku kartu
//●	gettere i settere, clanska karta ne moze da se menja
//●	konstruktore
//●	metodu stampaj koja stampa u formatu
//ime i prezime - broj kartice
//
//Kreirati klasu ClanskaKarta koja ima:
//●	popust (u rasponu od 5 do 10 %)
//●	broj kartice (npr: 9329-0239)
//●	gettere i setter
//●	konstuktore