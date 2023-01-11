package p_10_01_2023;

public class Zadatak1 {

    public static void main(String[] args) {

        Tacka t = new Tacka(5,6);


        Tacka p = new Tacka();
        p.setX(8);
        p.setY(15);

        p.stampaj();
        p.pomeriPoX(14);
        p.stampaj();
        t.stampaj();
        p.pomeriPoX(-4);
        p.stampaj();
    }


}

//.Zad
//Za klasu Tacka, koja ima privatne atribute:
//x - x koordinata
//y - y koordinata
//Javne metode:
//metodu stampaj
//imamo difoltni konstruktor
//imamo konstuktor koji prima obe koordinate za kreiranje objekta
//geter za x
//geter za y
//seter za x
//seter za y
//
//U glavnom programu kreirati dva objekta:
//Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
//Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40