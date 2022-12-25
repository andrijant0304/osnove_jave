package p_21_12_2022;

import java.util.ArrayList;

public class Zadatak5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        System.out.println("Originalan niz: " + numbers);

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {

            int num = numbers.get(i);
            sum = sum + num;

        }

        System.out.println("Suma je: " + sum);
    }
}


//Zadatak
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
//        i racuna i stampa sumu svih brojeva niza.
//        Primer: Ako je niz 1,2,4,5,7
//        Stampa se, suma = 19
