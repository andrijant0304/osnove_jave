package domaci_26_12_2022;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        String firstName = "Andrija";
        String lastName = "Antic";

        connect(firstName, lastName);
//        System.out.println(concat(firstName, lastName));
    }

    public static String connect(String firstName, String lastName){
        return firstName + " " + lastName;
    }
}

//2.	Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
// Metoda od parametara prima ime i prezime (2 parametra) i vraca jedan string tako sto spoji ime i prezime.
// METODA NISTA NE STAMPA.
//Primer poziva: Ako se metoda pozvoe za ime=”Milan” i prezime=”Jovanovic”, metoda vraca “Milan Jovanovic”
