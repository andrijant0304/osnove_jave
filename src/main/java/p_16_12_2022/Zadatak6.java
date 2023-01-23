package p_16_12_2022;

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String firstName = s.next();

        System.out.print("Unesite prezime: ");
        String lastName = s.next();

        System.out.print("Unesite jmbg: ");
        String jmbg = s.next();

        System.out.print("Unesite broj primeraka za stampu: ");
        int copy = s.nextInt();

        for (int i = 0; i < copy ; i++) {   //  (int i = 1; i <= copy ; i++)
            System.out.println();
            System.out.println("Primerak " + (i+1));    //  + i
            System.out.println("**********************************");
            System.out.println("Ime i prezime: " + firstName + " " + lastName);
            System.out.println("JMBG: " + jmbg);
            System.out.println("**********************************");

        }

    }

}

//
//    Napisati program koji simulira stampanje ocitane licne karte u vise primeraka.
//    Korisnik unosi podatke :
//        ime
//        prezime
//        jmbg
//        broj primeraka za stampu
//        Primer izvrsenja:


//        Unesite ime: Milan
//        Unesite prezime: Jovanovic
//        Unesite jmbg: 2109238932232
//        Unesite broj primeraka za stampu: 3
//        Primerak 1
//        **********************************
//        Ime i prezime: Milan Jovanovic
//        JMBG: 2109238932232
//        **********************************
