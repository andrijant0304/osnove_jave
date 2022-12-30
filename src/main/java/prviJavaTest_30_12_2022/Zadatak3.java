package prviJavaTest_30_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        int evenSum = 0;
        int oddSum = 0;



        for (int i = 1; i <= n; i++) {
            System.out.print("Unesite broj: ");
            int num = s.nextInt();

            if (num % 2 == 0){
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }


        System.out.print("Niz parnih: ");
        for (int i = 0; i <= evenNumbers.size()-1; i++) {

            System.out.print(evenNumbers.get(i) + ", ");
        }
        System.out.println();

        System.out.print("Suma parnih: ");
        for (int i = 0; i < evenNumbers.size(); i++) {
            evenSum = evenSum + evenNumbers.get(i);
        }
        System.out.println(evenSum);


        System.out.print("Niz neparnih: ");
        for (int i = 0; i <= oddNumbers.size()-1; i++) {

            System.out.print(oddNumbers.get(i) + ", ");
        }

        System.out.println();
        System.out.print("Suma neparnih: ");
        for (int i = 0; i <= oddNumbers.size()-1; i++) {
            oddSum = oddSum + oddNumbers.get(i);

        }
        System.out.println(oddSum);

    }
}


//3.	Zadatak (Nizovi)
//        Napisati program koji cuva dva niza celih brojeva, jedan za parne brojeve a drugi za neparne brojeve.
//        Program sa tastature ucitava N brojeva koje unosi korisnik i parne brojeve dodaje u niz parnih brojeva
//        a neparne brojeve u niz neparnih. Na kraju programa odstampati brojeve oba niza kao i sumu svakog niza.
//        Napomena: Nizovi se stampaju koristeci petlje.
//
//        Primer izvrsenja:
//        Unesite N: 9
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 4
//        Unesite broj: 8
//        Unesite broj: 3
//        Unesite broj: 9
//        Unesite broj: 13
//        Unesite broj: 10
//        Unesite broj: 4
//
//        Niz parnih: 2, 4, 8, 10, 4
//        Suma parnih: 28
//        Niz neparnih: 1, 3, 9, 13
//        Suma neparnih: 26
//























