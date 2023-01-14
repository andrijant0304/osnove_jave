package p_13_01_2023;

import java.util.ArrayList;

public class Pasta {

    private ArrayList<Sastojak> sastojci;

//    constructors
    public Pasta() {
    }

//    METHODS

    public void cenaPaste(){
        for (int i = 0; i < sastojci.size(); i++) {
        }
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
//metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din
//
//
//(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
//
//U glavnom programu kreirati objekte i testirati funkcionalnosti