package p_20_12_2022;

import java.util.Scanner;

public class Zadatak7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int sum = 0;

        System.out.print("Unesite vrednost: ");
        int x = s.nextInt();

        while (sum + x <= 100){
            sum = sum + x;

            System.out.print("Unesite vrednost: ");
            x = s.nextInt();

        }

        System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + sum + ".");
    }
}

//    Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.
//        Na kraju programa ispisati sracunatu sumu.
//        Unesite vrednost: 20
//        Unesite vrednost: 50
//        Unesite vrednost: 50
//        Prekoracenje! Kraj programa. Sracunata suma je 70.

