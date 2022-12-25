package p_21_12_2022;

import java.util.ArrayList;

public class Zadatak2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(11);
        numbers.add(21);
        numbers.add(31);
        numbers.add(41);
        numbers.add(51);



        for (int i : numbers) {
            System.out.print(i + ", ");

        }

        System.out.println();
        System.out.println("Duzina niza je " + numbers.size());

        System.out.println("Originalan niz: " + numbers);

        int sum = numbers.get(2) * 10;      //  numbers.set(
        numbers.set(2, sum);
//        numbers.set(numbers.get(3) *2 );

        System.out.println("Promenjen niz: " + numbers);

//        System.out.println(numbers.length(numbers.get(3)));
    }
}

//    Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i
//        menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.
