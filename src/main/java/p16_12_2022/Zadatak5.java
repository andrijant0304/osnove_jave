package p16_12_2022;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite jacinu zvuka: ");
        int volume = s.nextInt();

        System.out.print("<");

        if ( volume == 0 ){
            System.out.println("/");
        } else {
            for (int i = 0; i < volume ; i++) {

                System.out.print("| ");
            }
        }
    }
}

//
//    Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10)
//    i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
//        Primer izvrsenja;
//        Unesite jacinu zvuka: 8
//< | | | | | | | |

//(Dopuna za vezbanje)
//        Ukoliko je jacina zvuka 0 stampa se slika </ (simulacija za mute)
//        u sprotnom < | | | (sa brojem crtica jacinom zvuka)

