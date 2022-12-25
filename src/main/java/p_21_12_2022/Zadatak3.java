package p_21_12_2022;

import java.util.ArrayList;

public class Zadatak3 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(101);
        numbers.add(201);
        numbers.add(301);
        numbers.add(401);
        numbers.add(501);



        for (int i : numbers) {
            System.out.print(i + ", ");

        }

        System.out.println();
        System.out.println("Duzina niza je " + numbers.size());

        System.out.println("Originalan niz: " + numbers);

        int num1 = numbers.get(0);
        int num2 = numbers.get(numbers.size() - 1);


        numbers.set(0, num2);
        numbers.set(numbers.size() - 1, num1);



        System.out.println("Promenjen niz: " + numbers);

    }
}


//    Napisati program koji u sebi ima definisan niz od 5 brojeva (brojevi su proizvoljni)
//    i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
