package p_26_12_2022;

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        printStars(n);
        System.out.println();
    }

    public static void printStars(int n) {

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

    }
}


//    Napisati metodu koja stampa N zvezdica u istom redu, na kraju reda stampa novi red..
//    Broj zvezdica je odredjen parametrom N.
//        Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//        N=5, print je=> * * * * *
//
//        Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//        N=9, print je=> * * * * * * * * *
