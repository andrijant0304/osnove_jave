package p_19_12_2022;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj izvresnja N: ");
        int n = s.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Unesite broj: ");
            int num = s.nextInt();
            sum = sum + num;
        }

        System.out.println("Suma je: " + sum);


    }
}


//    Napisati program koji od korisnika ucitava N brojeva  i ispisuje sumu tih brojeva.
//        N nam kaze koliko broja ce korisnik da unese.
//        Primer izvrsenja:
//        Unesite N: 3
//        Unesite broj: 1
//        Unesite broj: 4
//        Unesite broj: 9
//        Suma je 14.
