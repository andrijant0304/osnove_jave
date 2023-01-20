package p__19_01_2023;

public class Zadatak4 {
    public static void main(String[] args) {

        Disciplina skakanje = new Disciplina("Skok u dalj", "skakaci");
        Disciplina trka = new Disciplina("110m prepone", "trkaci");

        skakanje.dodajAtleticara(new Skakac("Andrija A", 8.0));
        skakanje.dodajAtleticara(new Skakac("John Smith", 8.5));
        skakanje.dodajAtleticara(new Skakac("Nikola N", 8.2));

        skakanje.diskvalifikujAtleticara("John Smith");
        skakanje.pobednik();


        trka.dodajAtleticara(new Trkac("Andrija Antic", 12.1));
        trka.dodajAtleticara(new Trkac("Bla bla", 12.8));
        trka.dodajAtleticara(new Trkac("Petar Pantic", 11.5));

        trka.pobednik();




    }

}

//U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“
// sa proizvoljnim brojem učesnika,

//Zadatak 4. Kreirati apstraktnu klasu Atleticar čiji su tributi:
//ime i prezime privatni
//i rezultat ostvaren na takmičenju koji je zasticen
//Javne metode klase su:
//apstratktna metoda koja ispituje da li je rezultat atletičara bolji
// od rezultata drugog atletičara (metoda za parametar prima atleticara,
// ne rezultat drugog atleticara!!)
//metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)

//Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar.
// Kod trkača je bolji manji rezultat, a kod skakača veći.

//Kreirati i klasu Disciplina čiji su privatni atributi:
//ime discipline
//tip discipline (Trkacka ili Skakacka)
//niz atletičara koji učestvuju u toj disciplini.

//U javnom delu klase definisati:
//konstuktore, gettere i settere
//konstruktor koji postavlja ime discipline i tip
//metodu dodaj atleticara u disciplinu
//metodu diskvalifikuj atleticara iz discipline,
// za parametar funkcije prima se ime i prezime atleticara
//(za vezbanje) privatnu metodu koja pronalazi i vraca atletircara
// (ne ime i prezime) sa najboljim rezultatom
//(za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.

//U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“
// sa proizvoljnim brojem učesnika,
// (za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.