package domaci__10_01_2023;

public class Zadatak1 {

    public static void main(String[] args) {

        Autor a = new Autor("Mesa", "Selimovic");
        Knjiga k = new Knjiga("978-86-7580-160-2", "Dervis i smrt", 1966);

        Autor b = new Autor("Dejan-Tijago", "Stankovic");
        Knjiga z = new Knjiga("978-86-521-3625-4", "Zamalek", 2020);

        Autor m = new Autor("Miodrag", "Majic");
        Knjiga r = new Knjiga("978-86-10-04502-4", "Rudnik", 2022);


        k.setNapisaoJe(a);
        z.setNapisaoJe(b);
        r.setNapisaoJe(m);

        k.stampaKnjigu();
        z.stampaKnjigu();
        r.stampaKnjigu();

    }
}

//1.	Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
//
//	U glavnom programu napraviti vise autora sa vise knjiga.