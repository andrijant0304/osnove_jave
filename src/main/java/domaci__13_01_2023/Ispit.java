package domaci__13_01_2023;

public class Ispit {

    private String predmet;
    private int ocena;
    private String profesor;


//    constructors
    public Ispit(String predmet, int ocena, String profesor) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.profesor = profesor;
    }

//    getters and setters

    public int getOcena() {
        return ocena;
    }


//    METHODS
    public boolean polozenIspit(){
        if(this.ocena > 5) return true;
        return false;
    }

    public void stampajIspit(){
        System.out.println("Naziv: " + this.predmet + "  - Profesor: " + this.profesor + " - Ocena: " + this.ocena);
    }
}

//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati

//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta

//metodu dodaj ispit u niz ispita

//metodu koja racuna prosek na studijama
// (u prosek se ubrajaju samo polozeni ispiti)

//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
//
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet

//konstuktore koje mislite da ce vam trebati

//gettere i settere za sve atribute

//metodu koja kaze da li je ispit polozen
// (polozen je ako je ocena od 6 do 10)

//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)
