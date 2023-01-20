package p__19_01_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {


        PoreskaUprava puNis = new PoreskaUprava();

        Objekat kuca1 = new Kuca("Jug Bogdanova 1", 100, 1, 5);
        Objekat kuca2 = new Kuca("Jugovica 1", 120, 3, 4);
        Objekat kuca3 = new Kuca("Kraljevica Marka 1", 80, 3, 2);

        Objekat zgrada1 = new Zgrada("Katiceva 2", 1500, 1, 15);
        Objekat zgrada2 = new Zgrada("Laze kostica 2", 1200, 2, 14);
        Objekat zgrada3 = new Zgrada("Jablanicka 2", 2500, 3, 30);

        Objekat lokal1 = new Lokal("Dusanova 1", 52, 1);
        Objekat lokal2 = new Lokal("Dusanova 14", 102, 2);
        Objekat lokal3 = new Lokal("Dusanova 56", 66, 3);


        puNis.dodajObjekat(zgrada1);
        puNis.dodajObjekat(zgrada2);
        puNis.dodajObjekat(zgrada3);
        puNis.dodajObjekat(kuca1);
        puNis.dodajObjekat(kuca2);
        puNis.dodajObjekat(kuca3);
        puNis.dodajObjekat(lokal1);
        puNis.dodajObjekat(lokal2);
        puNis.dodajObjekat(lokal3);

        puNis.stampajSve();

    }
}

//Zadatak 2.. Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi.
// NE NAZIVAJTE KLASU OBJECT !!
//adresa (ulica i broj)
//povrsina objekta
//zona (1, 2 ili 3)
//konstuktore, gettere i settere
//metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//zona 1, koeficijent je 1.4
//zona 2, koeficijent je 1.1
//zona 3, koeficijent je 1.05
//abstraktnu metodu koja racuna i vraca porez objekta
//abstraktnu metodu stampaj
//
//	Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima
//	broj clanova koji zive u tom objektu,
//konstuktore, gettere i setter
//porez racuna po formuli: koeficijent * povrsina.
//prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
//
//	Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//broj stanova
//konstuktore, gettere i setter
//porez racuna po formuli koeficijent * povrsina * broj stanova
//prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
//
//	Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//konstuktore
//porez racuna po formuli koeficijent * povrsina * 1.3
//prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
//
//	Kreirati klasu PoreskaUprava koja za atribute ima:
//ime grada u kom se nalazi
//niz objekata
//metodu dodaj objekat
//(ze vezbanje)metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
//(za vezbanje) metodu koja vraca objekat sa najmanjim porezom
//metodu koja racuna ukupan porez za ceo grad
//metodu koja stampa sve objekte

//U glavnom programu napraviti jednu poresku upravu i u nju
// dodati minimum 3 razlicita objekta i istestirati sve metode.