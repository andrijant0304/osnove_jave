package domaci_14_12_2022;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vase ime: ");
        String firstName = s.next();

        System.out.print("Unesite vase prezime: ");
        String lastName = s.next();

        System.out.print("Koliko imate godina: ");
        String age = s.next();

        System.out.println(firstName + " " + lastName + " - " + age + " god");

    }

}


//1.	Napisati program koji ima informacije koje ucitava sa tastature:
//        ●	Ime
//        ●	Prezime
//        ●	godinu rodjenja
//        I stampa informaicije u formatu:
//        [ime] [prezime] - [startost] god
//
//        Primer izvrsenja:
//        Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
//        Milan Jovanovic - 26 god
