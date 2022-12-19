package domaci_16_12_2022;

import java.util.Scanner;

public class Vezbanje4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite dimenziju table: ");
        int dimension = s.nextInt();

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("_|");
            }
            System.out.println("_|");

        }



    }
}


//(Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
//        Primer izvrsenja:
//        Unesite dimenziju table: 5
//        _|_|_|_|_|
//        _|_|_|_|_|
//        _|_|_|_|_|
//        _|_|_|_|_|
//        _|_|_|_|_|
//
//        Primver izvrsenja 2:
//        Unesite dimenziju table: 7
//        _|_|_|_|_|_|_|
//        _|_|_|_|_|_|_|
//        _|_|_|_|_|_|_|
//        _|_|_|_|_|_|_|
//        _|_|_|_|_|_|_|
//        _|_|_|_|_|_|_|
//        _|_|_|_|_|_|_|
