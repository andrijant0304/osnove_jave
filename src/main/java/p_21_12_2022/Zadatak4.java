package p_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(101);
        numbers.add(201);
        numbers.add(301);
        numbers.add(401);
        numbers.add(501);


        System.out.println("Duzina niza je " + numbers.size());

        System.out.println("Originalan niz: " + numbers);

        System.out.print("Unesite poziciju (0 - 4): ");
        int position = s.nextInt();

        int result = numbers.get(position);

        System.out.println("Na poziciji " + position + " je vrednost " + result);

        for (int i = 0; i < numbers.size(); i++) {

          System.out.print(numbers.get(i)+ ", ");

        }

    }
}

//.Zadatak
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i
//        koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//        Primer:
//        Unesite pozicjiu: 2
//        Na pozicji 2 je vrednost 7.
