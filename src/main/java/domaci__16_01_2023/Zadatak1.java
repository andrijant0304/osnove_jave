package domaci__16_01_2023;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Igrac> tim = new ArrayList<>();

        Igrac i1 = new Igrac("Andrija A", "285059698433", 1980, 5, "odbrana", false);
        Igrac i2 = new Igrac("Lionel M", "3543333331223", 1988, 10, "napadac", true);

        Trener t1 = new Trener("Jirgen K", "234568545623", 1972, 18, "za igru");
        Trener t2 = new Trener("John S", "546568545623", 1968, 20, "kondicioni");

        tim.add(i1);






//        i1.stampaj();
//        i2.stampaj();
//
//        t1.stampaj();
//        t2.stampaj();
    }
}

//Zadatak
//Kreirati klasu Osoba koja ima:
//-	ime i prezime
//-	jmbg
//-	godinu rodjenja
//-	default-ni konstuktor
//-	konstuktor sa parametrima
//-	gettere i settere
//-	metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//-	broj (broj koji igrac nosi)
//-	poziciju koju igra (odbrambeni, napadac, … )
//-	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//-	default-ni konstuktor
//-	konstuktor sa parametrima
//-	gettere i settere za broj, kapiten i poziciju
//-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//-	godine iskustva
//-	tip trenera (kondicioni, za igru, pomocni, personalni)
//-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera,
// na kraju programa ispisati sve igrace i trenere.
// Podatke za igrace i trenere unosi korisnik sa tastature.
