package vezbanje_15_12_2022;

import java.util.Scanner;

public class Vezbanje1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ukupan broj rezultata: ");
        int totalNumOfEntries = s.nextInt();

        System.out.print("Unesite broj rezultata po strani: ");
        int pageNumOfEntries = s.nextInt();

        System.out.print("Unesite stranu: ");
        int pageNumber = s.nextInt();



        int pageDisplayMin = pageNumOfEntries * (pageNumber - 1) +1;
        int pageDisplayMax = pageNumOfEntries * pageNumber;


        if ( totalNumOfEntries <= 0 || pageNumOfEntries <= 0 || pageNumber <= 0){
            System.out.println("Uneli ste pogresne parametre");

        } else {
            if ( pageDisplayMax > totalNumOfEntries){
                pageDisplayMax = totalNumOfEntries;

            }

            if ( (pageDisplayMin - 1) >= totalNumOfEntries){
                System.out.print("No results for page " + pageNumber);

            } else {
                System.out.println("Prikaz: Showing " + pageDisplayMin + " to " + pageDisplayMax + " of " + totalNumOfEntries + " entries");

            }
        }
    }
}


//    Napisati program koji simulira paginaciju tabele. Korisnik sa tastature unosi:
//        •	ukupan broj rezultata
//        •	broj rezultata po strani
//        •	stranu
//        Program ispisuje poruku koji rezultati ce biti prikazani.

//        Primer izvrsenja 1:
//        Unesite ukupan broj rezultata: 20
//        Unesite broj rezultata po strani: 5
//        Unesite stranu: 3
//        Prikaz: Showing 11 to 15 of 20 entries

//        Primer izvrsenja 2:
//        Unesite ukupan broj rezultata: 23
//        Unesite broj rezultata po strani: 10
//        Unesite stranu: 3
//        Prikaz: Showing 21 to 23 of 23 entries

//        Primer izvrsenja 3:
//        Unesite ukupan broj rezultata: 23
//        Unesite broj rezultata po strani: 10
//        Unesite stranu: 4
//        Prikaz: No results for page 4.
