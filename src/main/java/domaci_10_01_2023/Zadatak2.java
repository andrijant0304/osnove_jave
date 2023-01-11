package domaci_10_01_2023;

public class Zadatak2 {

    public static void main(String[] args) {

        Proizvod p = new Proizvod("cokolada", 200);
        Kupac k = new Kupac("Andrija Antic");
        ClanskaKarta ck = new ClanskaKarta(5,"1234-5678");

        p.setMusterija(k);
        p.setClanKarta(ck);
        ck.setClan(k);
        k.setKartica(ck);


        Proizvod p2 = new Proizvod("cipele", 6000);
        Kupac k2 = new Kupac("John Smith");
        ClanskaKarta ck2 = new ClanskaKarta(8,"9894-1218");

        p2.setMusterija(k2);
        p2.setClanKarta(ck2);
        ck2.setClan(k2);
        k2.setKartica(ck2);


        p.stampajProizvod();

        p2.stampajProizvod();
//        k.stampajKupca();


    }
}

//Zadatak (POGLEDAJ SLIKU)
//Kreirati klasu Proizvod koja ima
//●	Naziv proizvoda
//●	kupca/musteriju
//●	cenu izrade proizvoda
//●	gettere i settere
//●	konstruktore
//●	Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//●	Metodu za stampanje proizvoda u formatu:
//naziv proizvoda - cena
//ime i prezime - broj kartice
//
//Kreirati klasu Kupac koja ima:
//●	ime i prezime
//●	clansku kartu
//●	gettere i settere, clanska karta ne moze da se menja
//●	konstruktore
//●	metodu stampaj koja stampa u formatu
//ime i prezime - broj kartice
//
//Kreirati klasu ClanskaKarta koja ima:
//●	popust (u rasponu od 5 do 10 %)
//●	broj kartice (npr: 9329-0239)
//●	gettere i setter
//●	konstuktore
