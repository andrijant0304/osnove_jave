package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        System.out.println("Niz: " + numbers);

        System.out.print("Unesite poziciju od 0 do 9: ");
        int k = s.nextInt();

        System.out.print("Unesite novu vrednost: ");
        int newNum = s.nextInt();

        numbers.set(k, newNum);

        System.out.println("Novi niz: " + numbers);

    }
}

//Napisati program koji u sebi ima definisan niz od 10 brojeva (brojevi su proizvoljni)
// i koji menja vrednost elementa na poziciji K.
// K i novu vrednost unosi korisnik.

//Primer:
//Unesite poziciju od 0 do 9: 3
//Unesite novu vrednost: 11
//Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.
