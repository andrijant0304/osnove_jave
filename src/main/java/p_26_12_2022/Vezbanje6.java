package p_26_12_2022;

import java.util.Scanner;

public class Vezbanje7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite M: ");
        int m = s.nextInt();

        for (int i = 1; i <= m; i++) {
            printStars(i);
        }
    }

    public static void printStars(int i) {

        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

//    Napisati main program koji koristi metodu definisanu u 6.zad tako da stampa sledecu sliku za M.
//    M unosi korisnik.
//
//
//        Primer izvrsenja:
//        Unesite M: 6
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *
