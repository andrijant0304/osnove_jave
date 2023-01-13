package p_12_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        ArrayList<Sastojak> sastojci = new ArrayList<>();

//        Sastojak s1 = new Sastojak("cokolada", 250);
//        Sastojak s2 = new Sastojak("mleko", 150);
//        Sastojak s3 = new Sastojak("kakao", 200);
//        Sastojak s4 = new Sastojak("keks", 100);

//        s.add(new Sastojak("cokolada", 250));
//        s.add(new Sastojak("mleko", 150));
//        s.add(new Sastojak("kakao", 200));
//        s.add(new Sastojak("keks", 100));

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite naziv: ");
            String naziv = s.next();
            System.out.print("Unesite cenu: ");
            int cena = s.nextInt();

            Sastojak x = new Sastojak(naziv, cena);
            sastojci.add(x);

        }
        System.out.println();

        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println(sastojci.get(i).getNaziv() + ", " + sastojci.get(i).getCena());

        }
    }
}

//Kreirati klasu Sastojak koja ima:
//●	naziv sastojka
//●	cenu
//●	gettere i settere
//●	konstuktore
//
//
//--U glavnom programu kreirati 3 sastojka.
// U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e
