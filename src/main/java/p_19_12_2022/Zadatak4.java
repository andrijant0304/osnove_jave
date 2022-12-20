package p_19_12_2022;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite K: ");
        int k = s.nextInt();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        int y = 1;


        for (int i = 0; i < k; i++) {
            y = y * n;
        }

        System.out.println("Rezultat: " + y);
    }
}


//    Napisati program koji pronalazi K-ti stepen broja N. Koristeci FOR petlju
//        K i N unosi korisnik.
//        Primer izvrsenja:
//        Unesite K: 7
//        Unesite N: 2
//        Rezultat 128
