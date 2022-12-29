package domaci_27_12_2022;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite jedinicu tezine (kg ili t): ");
        String unit = s.next();

        Product food = new Product();
        food.name = "chocolate";
        food.price = 2250;
        food.weight = 1500;
        food.converter(unit, food.weight);
        food.print();



        Product tv = new Product();
        tv.name = "LG";
        tv.price = 55000;
        tv.weight = 15000;
        tv.converter(unit, tv.weight);
        tv.print();

    }




}

//    Auto bmw = new Auto();
//        bmw.marka = "BMW";
//                bmw.trenutnaBrzina = 100;
//                bmw.fabrickaPotrosnja = 10;
//                bmw.vozac = "Milan Jovanovic";
//                bmw.brojVrata = 5;
//                bmw.kubikaza = 2000;
//                bmw.registrovanDo = 10;
//                bmw.godinaProizvodnje = 1980;


//1.	Napisati klasu Proizvod koja ima atribute
//        ○	naziv proizvoda (String)
//        ○	cenu proizvoda (double)
//        ○	težinu proizvoda u gramima. (double)
//        i metode:
//        ○	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        ○	konvertuj - metoda konvertuje tezinu u kilograme i tone.
//          Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost.
//          Jedinica moze biti “kg” ili “t”
//
//        Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//        Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

