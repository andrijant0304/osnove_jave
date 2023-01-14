package domaci__13_01_2023;

import java.util.ArrayList;

public class Student {

    private String brojIndexa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispit;

//    constructors

    public Student(String brojIndexa, String imeIPrezime, String tipStudija, ArrayList<Ispit> ispit) {
        this.brojIndexa = brojIndexa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispit = new ArrayList<>();
    }


    //    getters and setters


    //    METHODS
    public void dodajIspit(String ispit, int ocena, String profesor){
        Ispit i = new Ispit(ispit, ocena, profesor);
        this.ispit.add(i);
    }

    public double izracunajProsek(){
        double sum = 0;
        int counter = 0;
        for (int i = 0; i <  this.ispit.size(); i++) {
            if(ispit.get(i).polozenIspit()){
                sum = sum + this.ispit.get(i).getOcena();
                counter++;
            }
        }
        return sum / counter;
    }

    public void stampaj(){
        System.out.println("Broj indexa: " + this.brojIndexa + " - Student: " + this.imeIPrezime + " - Tip studija: " + this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispit.size(); i++) {
            ispit.get(i).stampajIspit();
            if(ispit.get(i).polozenIspit()){
                System.out.println("Polozen ispit!");
            } else {
                System.out.println("Nije polozen :( ");
            }
            System.out.println();
        }
        System.out.println("Prosecna ocena je: " + izracunajProsek());
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
// (u prosek se ubrajaju samo polozeni ispit)

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
