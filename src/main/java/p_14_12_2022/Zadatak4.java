package p_14_12_2022;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj A: ");
        int a = s.nextInt();

        System.out.print("Unesite broj B: ");
        int b = s.nextInt();

        if (a > b){

            System.out.println("B je manje");

        }
        if (a < b){

            System.out.println("A je manje");

        }
        if (a == b){

            System.out.println("A i B su jednaki");

        }

    }

}
