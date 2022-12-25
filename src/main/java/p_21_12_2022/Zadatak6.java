package p_21_12_2022;

import java.util.ArrayList;

public class Zadatak6 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        System.out.println("Originalan niz: " + numbers);


        for (int i = numbers.size()-1; i >= 0; i--) {

            System.out.print(numbers.get(i) + ", ");
        }
    }
}

//.Zadatak
//        Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//        Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

