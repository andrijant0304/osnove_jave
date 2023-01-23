package p_14_12_2022;

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj A: ");
        int a = s.nextInt();

        System.out.print("Unesite broj B: ");
        int b = s.nextInt();

        System.out.print("Unesite broj C: ");
        int c = s.nextInt();

        int sum1 = a*a + b*b;
        int sum2 = c*c;

        if ( sum1 == sum2 ){    // (a*a + b*b == c*c)

            System.out.println("Trougao je pravougli");

        } else  {

            System.out.println("Trougao nije pravougli");
        }


    }

}
