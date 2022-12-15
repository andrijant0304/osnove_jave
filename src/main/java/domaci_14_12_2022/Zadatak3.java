package domaci_14_12_2022;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite x za T1: ");
        int t1xAxis = s.nextInt();

        System.out.print("Unesite y za T1: ");
        int t1yAxis = s.nextInt();

        System.out.print("Unesite x za T2: ");
        int t2xAxis = s.nextInt();

        System.out.print("Unesite y za T2: ");
        int t2yAxis = s.nextInt();

        System.out.print("Unesite x za M: ");
        int mXAxis = s.nextInt();

        System.out.print("Unesite y za M: ");
        int mYAxis = s.nextInt();




    }

}


//3.	 Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
//        Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
//
//        T1 i T2 su pozicije login forme. M je pozicija na koju je kliknuto
//
//    Primer izvrsenja 1:
//        Unesite x za T1: 10
//        Unesite y za T1: 100
//        Unesite x za T2: 100
//        Unesite y za T2: 0
//        Unestie x za M: 50
//        Unesite y za M: 50
//        Kliknuto je unutar forme
//
//        Primer izvrsenja 2:
//        Unesite x za T1: 10
//        Unesite y za T1: 100
//        Unesite x za T2: 100
//        Unesite y za T2: 0
//        Unestie x za M: 120
//        Unesite y za M: 50
//        Nije kliknuto je unutar forme
