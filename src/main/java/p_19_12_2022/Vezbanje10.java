package p_19_12_2022;

import java.util.Scanner;

public class Vezbanje10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int num = s.nextInt();

        int sum;

        System.out.print("Novi broj je: ");

        for (int i = 0; i < 5; i++) {

            sum = num % 10;
            num = num / 10;

            System.out.print(sum);
        }

    }
}

//(Za vezbanje) Napisati program koji za sve petocifene brojeve radi mirror opciju.
//        Primer izvrsenja:
//        Unesite broj: 32492
//        Novi broj je 29423
