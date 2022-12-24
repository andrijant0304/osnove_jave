package p_19_12_2022;

import java.util.Scanner;

public class Zadatak12 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int points = 0;
            System.out.print("Unesite password: ");
            String pass = s.next();

            if (pass.length() > 8){
                points++;
            }
            if (pass.contains("@")){
                points++;
            }

            System.out.println("Password ima " + points + " poena");
            // points = 0;
        }
    }
}

//    Napisati program prikazuje koliko je svaki od unetih passworda jak.
//    Korisnik unosi N passworda i za svaki se ispisuje jacina.
//Svaki uslov koji password ispunjava dodaje po 1 poen:
//duzina veca od 8
//sadrzi @ specijalan karakter
//
//		Primer izvrsenja:
//		Unesite N: 3
//		Unesite password: passwdr
//		Password ima 0 poena.
//Unesite password: password123
//		Password ima 1 poena.
//		Unesite password: password!123
//		Password ima 2 poena.
