package prviJavaTest_30_12_2022;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime prve osobe: ");
        String name1 = s.next();
        System.out.print("Unesite godinu rodjenja prve osobe: ");
        int year1 = s.nextInt();
        System.out.print("Unesite mesec rodjenja prve osobe: ");
        int month1 = s.nextInt();
        System.out.print("Unesite dan rodjenja prve osobe: ");
        int day1 = s.nextInt();

        System.out.print("Unesite ime druge osobe: ");
        String name2 = s.next();
        System.out.print("Unesite godinu rodjenja druge osobe: ");
        int year2 = s.nextInt();
        System.out.print("Unesite mesec rodjenja druge osobe: ");
        int month2 = s.nextInt();
        System.out.print("Unesite dan rodjenja druge osobe: ");
        int day2 = s.nextInt();


        if (year1 < year2) {
            System.out.println(name1 + " je stariji");
        }

        if (year1 > year2) {
            System.out.println(name2 + " je stariji");
        }

        if (year1 == year2) {

            if (month1 < month2) {

                System.out.println(name1 + " je stariji");
            }
            if (month1 > month2) {

                System.out.println(name2 + " je stariji");
            }

            if (month1 == month2){

                if (day1 < day2){
                    System.out.println(name1 + " je stariji");
                }
                if (day1 > day2){
                    System.out.println(name2 + " je stariji");
                }
                if (day1 == day2){
                    System.out.println(name1 + " i " + name2 + " su rodjeni istog datuma.");
                }

            }

        }
    }
}

//1.	Zadatak (Grananja)
//        Napisati program koji za dve unete osobe ispisuje koja je starija. Za svaku osobu se od  podataka unosi ime, godina, mesec i dan rodjenja. Na kraju programa ispisati koja je osoba starija.
//
//        Primer izvrsenja 1:
//        Unesite ime prve osobe: Pera
//        Unesite godinu rodjenja prve osobe: 1998
//        Unesite mesec rodjenja prve osobe: 10
//        Unesite dan rodjenja prve osobe: 21
//        Unesite ime druge osobe: Mika
//        Unesite godinu rodjenja druge osobe: 1999
//        Unesite mesec rodjenja druge osobe: 12
//        Unesite dan rodjenja druge osobe: 15
//        Pera je stariji.
//
//        Primer izvrsenja 2:
//        Unesite ime prve osobe: Pera
//        Unesite godinu rodjenja prve osobe: 1998
//        Unesite mesec rodjenja prve osobe: 10
//        Unesite dan rodjenja prve osobe: 21
//        Unesite ime druge osobe: Mika
//        Unesite godinu rodjenja druge osobe: 1998
//        Unesite mesec rodjenja druge osobe: 12
//        Unesite dan rodjenja druge osobe: 15
//        Pera je stariji.
//
//        Primer izvrsenja 3:
//        Unesite ime prve osobe: Pera
//        Unesite godinu rodjenja prve osobe: 1998
//        Unesite mesec rodjenja prve osobe: 10
//        Unesite dan rodjenja prve osobe: 21
//        Unesite ime druge osobe: Mika
//        Unesite godinu rodjenja druge osobe: 1998
//        Unesite mesec rodjenja druge osobe: 10
//        Unesite dan rodjenja druge osobe: 15
//        Mika je stariji.
//
//
//
