package domaci_10_01_2023;

public class Kupac {

    private String imeIPrezime;
    private ClanskaKarta kartica;

    public Kupac(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;

    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKarta getKartica() {
        return kartica;
    }

    public void setKartica(ClanskaKarta kartica) {
        this.kartica = kartica;
    }

    //●	metodu stampaj koja stampa u formatu
//ime i prezime - broj kartice

    public void stampajKupca(){
        System.out.println("Kupac: " + this.imeIPrezime + " - broj kartice: " + this.kartica );
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
