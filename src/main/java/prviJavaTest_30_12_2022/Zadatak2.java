package prviJavaTest_30_12_2022;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite donju granicu toplomera: ");
        int bottomLevel = s.nextInt();

        System.out.print("Unesite gornju granicu toplomera: ");
        int topLevel = s.nextInt();

        if (topLevel <= bottomLevel) {
            System.out.println("Gornja granica mora biti veca od donje granice");
        } else {

            for (int i = topLevel; i >= bottomLevel; i--) {

                System.out.println("|-" + i + "  |");

            }

            System.out.println("\\     /\n" +
                    " |    |");
        }
    }
}

//2.	Zadatak (Petlje)
//        Napisati program koji petljom iscrtava toplomer. Korisnik sa tastature unosi granice toplomera i iscrtava se slika kao u primeru
//        Primer izvrsenja 1:
//        Unesite donju granicu toplomera: 35
//        Unesite gornju granicu toplomera: 42
//        |-42  |
//        |-41  |
//        |-40  |
//        |-39  |
//        |-38  |
//        |-37  |
//        |-36  |
//        |-35  |
//        \      /
//        |    |
//
//        Primer izvrsenja 2:
//        Unesite donju granicu toplomera: 34
//        Unesite gornju granicu toplomera: 40
//        |-40  |
//        |-39  |
//        |-38  |
//        |-37  |
//        |-36  |
//        |-35  |
//        |-34  |
//        \      /
//        |    |
//
