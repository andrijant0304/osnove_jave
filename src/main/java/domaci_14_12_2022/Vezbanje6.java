package domaci_14_12_2022;

import java.util.Scanner;

public class Vezbanje6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = s.nextInt();

        System.out.print("Unesite b: ");
        int b = s.nextInt();

        System.out.print("Unesite c: ");
        int c = s.nextInt();

        System.out.print("Unesite d: ");
        int d = s.nextInt();

        String p = " #";

        String negativeP = "";
        String positiveP = "";

        if ( a >= 0){
            positiveP = positiveP + " " + a;
        } else if (a < 0) {
            negativeP = negativeP + " " + a;
        }
        if ( b >= 0){
            positiveP = positiveP + " " + b;
        } else if (b < 0) {
            negativeP = negativeP + " " + b;
        }
        if ( c >= 0){
            positiveP = positiveP + " " + c;
        } else if (c < 0) {
            negativeP = negativeP + " " + c;
        }
        if ( d >= 0){
            positiveP = positiveP + " " + d;
        } else if (d < 0) {
            negativeP = negativeP + " " + d;
        }

        System.out.println("String p ime vrednost = " + negativeP.concat(p).concat(positiveP));
    }

}


//6. (Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #)
//        tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne. Konkatanacija stringova u javi->
//        Koristan link
//        Primer izvrsenja 1:
//        Unesite a: 10  -> # 10
//        Unesite b: -2   -> -2 # 10
//        Unesite c: -1   -> -1 -2 # 10
//        Unesite d: 9    -> -1 -2 # 10 9
//        String p ime vrednost = -1 -2 # 10 9
//
//
//
//
//        Primer izvrsenja 2:
//        Unesite a: 5
//        Unesite b: 4
//        Unesite c: 41
//        Unesite d: -1
//        String p ime vrednost = -1 # 5 4 41
//
//        Primer izvrsenja 3:
//        Unesite a: 11
//        Unesite b: 2
//        Unesite c: 7
//        Unesite d: 15
//        String p ime vrednost = # 11 2 7 15
//
