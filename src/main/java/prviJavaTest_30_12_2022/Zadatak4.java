package prviJavaTest_30_12_2022;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite lozinku: ");
        String pass1 = s.next();

        System.out.print("Potvrdite lozinku: ");
        String pass2 = s.next();

        int counter = 0;


        while (counter < 3 && !pass1.equals(pass2)) {

            System.out.println("Lozinke se ne poklapaju");
            System.out.print("Potvrdite lozinku: ");
            pass2 = s.next();
            counter++;
        }

        if (counter == 3) {

            System.out.println("Mogucnost postavljanja lozinke je blokirana");
        } else {
            System.out.println("Lozinka je uspesno postavljena");
        }
    }
}


//4.	Zadatak (While petlja)
//        Napisati program koji pruza mogucnost postavljanja lozinke.
//        Korisnik prvo unosi lozinku a zatim program od korisnika zahteva unos kojim potvrdjuje lozinku
//        sve dok se ne poklopi sa lozinkom ili dok mu se ne blokira mogucnost postavljanja lozinke.
//        Korisnik moze maksimalno 3 puta da pogresi potvrdu lozinke.
//        ●	Ukoliko se lozinke ne poklapaju ispisati gresku “Lozinke se ne poklapaju”
//        ●	Ukoliko korisnik unese pogresno potvrdu lozinke vise od 3 puta,
//        ispisati poruku “Mogucnost postavljanja lozinke je blokirana”
//        ●	Ukoliko se lozinke poklapaju ispisati “Lozinka je uspesno postavljena”
//        Primer izvrsenja 1:
//        Unesite lozinku: sifra123
//        Potvrdite lozinku: pogresna
//        Lozinke se ne poklapaju
//        Potvrdite lozinku: pogresna
//        Lozinke se ne poklapaju
//        Potvrdite lozinku: sifra123
//        Lozinka je uspesno postavljena
//
//
//        Primer izvrsenja 2:
//        Unesite lozinku: sifra123
//        Potvrdite lozinku: pogresna
//        Lozinke se ne poklapaju
//        Potvrdite lozinku: pogresna
//        Lozinke se ne poklapaju
//        Potvrdite lozinku: pogresna
//        Lozinke se ne poklapaju
//        Potvrdite lozinku: pogresna
//        Mogucnost postavljanja lozinke je blokirana
//
//
//
