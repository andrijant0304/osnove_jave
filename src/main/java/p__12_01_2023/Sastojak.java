package p__12_01_2023;

public class Sastojak {

    private String naziv;
    private int cena;

//    constructors

    public Sastojak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }
//    getters and setters

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

//    METHODS

}

//Kreirati klasu Sastojak koja ima:
//●	naziv sastojka
//●	cenu
//●	gettere i settere
//●	konstuktore
//
//
//--U glavnom programu kreirati 3 sastojka.
// U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika.
// Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e