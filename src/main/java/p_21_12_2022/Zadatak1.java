package p_21_12_2022;

import java.util.ArrayList;

public class Zadatak1 {

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

//        int lastIndex = numbers.size() - 1;   // poslednji element u nizu

        int sum = numbers.get(0) + numbers.get(4);  //  int sum = numbers.get(0) + numbers.get(numbers.size() - 1);
        System.out.println("Zbir prvog i petog broja u nizu je: " + sum );




    }
}


//    Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i
//        prikazuje sumu nultog i zadnjeg elementa tog niza.
