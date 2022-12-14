package p14_12_2022;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);



        System.out.print("Unesite broj B: ");
        int b = s.nextInt();

        System.out.print("Unesite broj C: ");
        int c = s.nextInt();

        System.out.print("Unesite broj A: ");
        int a = s.nextInt();

        if ( a >= b && a <= c ){

            System.out.println("A je opsegu B i C");

        } else {

            System.out.println("A nije opsegu B i C");
        }

    }

}
