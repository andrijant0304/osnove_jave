package p_19_12_2022;

import java.util.Scanner;

public class Vezbanje6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj izvrsenja N: ");
        int n = s.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Unesite broj: ");
            int num = s.nextInt();

            sum = sum * 10;
            sum = sum + num;


        }
        System.out.print("Rezultujuci broj je " + sum);

    }
}

//(ZA VEZBANJE)Napisati program koji od korisnika ucitava
//        N jednocifrenih brojeva i od njih formira rezultujuci broj kao na primeru
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 0
//        Unesite broj: 4
//        Unesite broj: 1
//        Rezultujuci broj je 12041 (Promenljiva tipa int)

