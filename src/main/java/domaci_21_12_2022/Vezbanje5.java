package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Vezbanje5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        int d = 1;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int num = s.nextInt();
            a.add(num);

        }
        System.out.println("Niz A: " + a);

        for (int i = 0; i < a.size(); i++) {
            if (i < 3){
                int c = a.get(i);
                b.add(c);
            } else {
                b.add(d);
            }
        }
        System.out.println("Niz B: " + b);

    }
}

//(Za vezbanje) Napisati program koji ucitava niz a duzine N. Nakon unosa niza a,
//        formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
//        a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
//
//
//        Unesite N: 6
//        Unesite broj: 1
//        Unesite broj: 5
//        Unesite broj: 2
//        Unesite broj: 7
//        Unesite broj: 8
//        Unesite broj: -1
//
//        Niz a: 1, 5, 2, 7, 8, -1
//        Niz b: 1, 5, 2, 1, 1, 1
