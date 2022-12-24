package domaci_20_12_2022;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite rimski broj: ");
        String num = s.next();
        int i = 1;
        int v = 5;
        int x = 10;
        int l = 50;
        int c = 100;
        int d = 500;
        int m = 1000;

        while ( !num.equals("KRAJ")){

            System.out.print("Arapski: ");

            if (num.equals("I")){
                System.out.println(i);
            }
            if (num.equals("V")){
                System.out.println(v);
            }
            if (num.equals("X")){
                System.out.println(x);
            }
            if (num.equals("L")){
                System.out.println(l);
            }
            if (num.equals("C")){
                System.out.println(c);
            }
            if (num.equals("D")){
                System.out.println(d);
            }
            if (num.equals("M")){
                System.out.println(m);
            }

            System.out.print("Unesite rimski broj: ");
            num = s.next();
        }

        System.out.println("Kraj programa.");
    }
}

//2.	Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost
//        sve dok korisnik ne unese KRAJ..
//Primer izvrsenja:
//        Unesite rimski broj: X
//        Arapski: 10
//        Unesite rimski broj: C
//        Arapski: 50
//        Unesite rimski broj: D
//        Arapski: 500
//        Unesite rimski broj: M
//        Arapski: 1000
//        Unesite rimski broj: I
//        Arapski: 1
//        Unesite rimski broj: KRAJ
//        Kraj programa.


