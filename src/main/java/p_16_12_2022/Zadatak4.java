package p_16_12_2022;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite M: ");
        int m = s.nextInt();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = m; i <= n; i++) {
//            if ( i > m && i < (n+1) ){
//                System.out.println(i);
//            }
            System.out.println(i);
        }

    }

}


//    Napisati porogram koji od korisnika ucitava dva broja M i N i stampa sve brojeve izmedju M i N.
//    Smatrajte da je M manje od N.
//        Primer izvrsenja:
//        Unesite M: 10
//        Unesite N: 15
//        10, 11, 12, 13, 14, 15,
