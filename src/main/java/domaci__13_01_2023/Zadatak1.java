package domaci__13_01_2023;

import java.util.ArrayList;

public class Zadatak1 {

    public static void main(String[] args) {

        Student s = new Student("12345", "Andrija A", "osnovne", new ArrayList<>());

        s.dodajIspit("predmet1", 9, "profa3");
        s.dodajIspit("predmet2", 7, "profa1");
        s.dodajIspit("predmet3", 5, "profa2");
        s.dodajIspit("predmet4", 6, "profa2");
        s.dodajIspit("predmet5", 8, "profa1");
        s.dodajIspit("predmet6", 10, "profa5");
        s.dodajIspit("predmet7", 6, "profa4");


        s.stampaj();
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
