package p_19_12_2022;

import java.util.Scanner;

public class Vezbanje9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int num = s.nextInt();

        int sum;

        for (int i = 0; i < 5; i++) {

            sum = num % 10;
            num = num / 10;



            System.out.print(sum + ", ");
        }
    }
}

//(Za vezbanje) Napisati program koji za sve petocifrene brojeve izvlaci sve cifre i
// stampa ih na ekranu.
//        Primer izvrsenja:
//        Unesite broj: 19452
//        2, 5, 4, 9, 1
