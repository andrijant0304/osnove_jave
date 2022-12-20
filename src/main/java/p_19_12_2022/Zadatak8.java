package p_19_12_2022;

import java.util.Scanner;

public class Zadatak8 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < n ; i++) {
            System.out.print("Unesite broj: ");
            int x = s.nextInt();

            sum = sum + x;

        }
        avg = sum / n;          //  int avg = 0;

        System.out.println("Srednja vrednost je " + avg);
    }
}

//    Napisati program koji od korisnika ucitava N brojeva i na kraju ispisuje
//    srednju vrednost svih brojeva.
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 9
//        Unesite broj: 6
//        Unesite broj: 8
//        Srednja vrednost je 5.
//        (Objasnjenj) 5 jer je celobrojno deljenje!
