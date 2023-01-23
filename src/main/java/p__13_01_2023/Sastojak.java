package p__13_01_2023;

public class Sastojak {

    private String naziv;
    private int cena;

//    constructor

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
    public void stampa(){
        System.out.println("Naziv: " + this.naziv + " - cena:" + this.cena + " din.");

    }
}

//Zadatak
//
//Kreirati klasu Sastojak koja ima:
//naziv
//cenu
//gettere i settere
//konstruktore
//metodu za stampanje koja stampa  podatke u formatu:
//naziv - cena.din
//
//	Kreirati klasu Pasta koja ima:
//niz sastojaka
//metodu za dodavanje sastojka
//defaultni konstruktor
//metodu koja racuna cenu paste, tako sto sumira cene
// svih sastojaka
//metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din
//
//
//(ostavite za kraj) metodu za brisanje sastojka.
// U metodu se salje naziv sastojka koji se brise.
//
//U glavnom programu kreirati objekte i testirati
// funkcionalnosti