package p_27_12_2022;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Account account1 = new Account();
        account1.number = "840-23932-323";
        account1.owner = "Andrija Antic";
        account1.balance = 10000;


        Account account2 = new Account();
        account2.number = "540-2443652-323";
        account2.owner = "Smith";
        account2.balance = 20000;



        System.out.print("Posiljalac: " + account1.number + " "
                                        + account1.owner + ", "
                                        + "stanje: " + account1.balance);
        System.out.println();

        System.out.print("Posiljalac: " + account2.number + " "
                                        + account2.owner + ", "
                                        + "stanje: " + account2.balance);
        System.out.println();

        System.out.print("Unesite sumu za transakciju: ");
        int sum = s.nextInt();
        System.out.println("Stanje nakon transakcije");

        System.out.print("Posiljalac: " + account1.number + " "
                                        + account1.owner + ", "
                                        + "stanje: " + (account1.balance - sum));
        System.out.println();

        System.out.print("Posiljalac: " + account2.number + " "
                                        + account2.owner + ", "
                                        + "stanje: " + (account2.balance + sum));
        System.out.println();


    }






}

//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.

//    Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun.
//    Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
////
//        Primer izvrsenja:
//        Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//        Primalac: Marko Markovic, 840-23932-334, stanje: 200
//        Unesite sumu za transakciju: 500
//        Stanje nakon stransakcije
//        Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//        Primalac: Marko Markovic, 840-23932-334, stanje: 700
