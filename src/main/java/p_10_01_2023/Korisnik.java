package p_10_01_2023;

public class Korisnik {

    private String ime;
    private String prezime;

//    constructors

    public Korisnik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

//    getters and setters

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

//    METHODS

    public void stampa(){
        System.out.println("Korisnik: " + this.ime + " " + this.prezime);
        System.out.println();
    }
}

//4.Zadatak
//Kreirati klasu Korisnik koja ima
//●	ime
//●	prezime
//●	gettere i settere za ime i prezime
//●	konstuktore koje mislite da su vam potrebni
//●	metoda koja stampa u formatu:
//(ime) (prezime)
//
//Kreirati klasu FacebookPost
//●	opis
//●	korisnik (referenca na korisnika koji je kreirao post)
//●	konstrukore koje mislite da su vam potrebni
//●	metoda print, stampa u formatu:
//(ime) (prezime)
//(opis post-a)
//
//U main metodi, kreirati jedan facebook post i
// jednog korisnika i pozvati svaku od metoda