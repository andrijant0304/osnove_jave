package domaci_26_12_2022;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj N: ");
        int n = s.nextInt();

        int m = for10xMore(n);
        System.out.print("Deset puta veca vrednost je: " + m);
    }

    public  static int for10xMore(int n){
        int m = n * 10;
        return m;
    }
}

//1.	Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.