package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Vezbanje6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<String> a = new ArrayList<>();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Unesite string: ");
            String t = s.next();

            a.add(0,t);
        }
        System.out.println("Niz A: " + a);

        System.out.print("Niz A: ");

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + ", ");
        }
    }
}

//(Za vezbanje) Napisati program koji ucitava niz stringova duzine N,
//        tako da ucitavanje elemenata u niz a bude obrnuto.
//        Primer:
//        Unesite N: 4
//        Unesite string: xxx1
//        Unesite string: xxx4
//        Unesite string: xxx6
//        Unesite string: xxx9
//
//        Niz a: xxx9, xxx6, xxx4, xxx1
//        Komentar: Stanje niza a u memoriji je:
//        a[0]="xxx9",
//        a[1]="xxx6",
//        a[2]="xxx4",
//        a[3]="xxx1",


