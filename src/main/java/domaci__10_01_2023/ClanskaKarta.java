package domaci__10_01_2023;

public class ClanskaKarta {

    private int popust;
    private  String brojKartice;

    private Kupac clan;

// constructors
    public ClanskaKarta(int popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }
// constructors END

// getters and setters
    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public Kupac getClan() {
        return clan;
    }

    public void setClan(Kupac clan) {
        this.clan = clan;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }
// getters and setters END

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
