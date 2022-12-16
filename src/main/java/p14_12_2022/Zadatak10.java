package p14_12_2022;

import java.util.Scanner;

public class Zadatak10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesi broj A: ");
        int a = s.nextInt();

        if (( a%2 == 0) && ( a%3 == 0)){
            System.out.println("Broj A je deljiv i sa brojem 2 i sa brojem 3 ");
        } else if ( a%2 == 0){
            System.out.println("Broj A je deljiv sa brojem 2");
        } else if ( a%3 == 0) {
            System.out.println("Broj A je deljiv sa brojem 3");
        } else {
            System.out.println("Broj A nije deljiv ni sa brojem 2 ni sa brojem 3");
        }
    }
}
