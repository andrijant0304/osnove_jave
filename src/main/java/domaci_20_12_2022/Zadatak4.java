package domaci_20_12_2022;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int counter1 = 0;

        System.out.print("Unos: ");
        String enterValue = s.next();

        while (!enterValue.contains("=")) {

            if (enterValue.contains("(")) {
                counter1++;
            } else if (enterValue.contains(")")) {
                counter1--;
            }

            System.out.print("Unos: ");
            enterValue = s.next();
        }

        if (counter1 == 0){
            System.out.println("Zagrade su uparene.");
        } else {
            System.out.println("Zagrade nisu uparene.");
        }
    }
}

//    Napisati program koji proverava uparenost zagrada.
//        Korisnik unosi matematicku formulu sve dok ne unese znak =.
//        Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje
//        da li su sve zagrade uparene.
//        Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//        Primer izvrsenja:
//        Unos: (
//        Unos: 2
//        Unos: *
//        Unos: (
//        Unos: 1
//        Unos: +
//        Unos: 3
//        Unos: )
//        Unos: )
//        Unos: =
//        Zagrade su uparene
//        (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
//
//        Primer izvrsenja 2:
//        Unos: (
//        Unos: 2
//        Unos: *
//        Unos: (
//        Unos: 1
//        Unos: +
//        Unos: 3
//        Unos: )
//        Unos: =
//        Zagrade nisu uparene
//        (Objasnjenje: fali poslednja zagrada iz formule)
