package p_29_12_2022;

public class Zadatak1 {

    public static void main(String[] args) {

        Auto bmw = new Auto();
        bmw.vozac = "Andrija Antic";
        bmw.marka = "BMW";
        bmw.brojVrata = 4;
        bmw.potrosnja = 10;
        bmw.trenutnaBrzina = 100;
//        bmw.ogranicenje = 130;
        bmw.godinaProizvodnje = 1998;
        bmw.mesecRegistracije = 11;
//        bmw.trenutniMesec = 10;
        bmw.kubikaza = 2000;
        bmw.brojRegistracije = "NI-123NI";
        bmw.ukljucenaKlima = true;
        bmw.maksimalnaBrzina = 240;


        bmw.stampa();
//        bmw.kazna(bmw.trenutnaBrzina, bmw.ogranicenje);
//        bmw.oldtimer(bmw.godinaProizvodnje);
//        bmw.registracija(bmw.mesecRegistracije, bmw.trenutniMesec);
//        bmw.izracunajCenuRegistracije(bmw.kubikaza);



        if(bmw.prekoracenje(50)){
            System.out.println("Brzina je prekoracena!");
            System.out.println("Kazna je: " + bmw.kazna(bmw.trenutnaBrzina) + " dinara.");
        }else{
            System.out.println("Brzina nije prekoracena.");
        }


        if(bmw.oldtimer()){
            System.out.println("Auto je oldtimer.");
        } else {
            System.out.println("Auto nije oldtimer.");
        }

        if (bmw.registracija(10)){
            System.out.println("Auto je registrovan.");
        } else {
            System.out.println("Registacija je istekla!");
        }

        System.out.println("Cena registracije je: " + bmw.izracunajCenuRegistracije());

        System.out.println(bmw.otvorenGepek);
        bmw.otvoriGepek();
        System.out.println(bmw.otvorenGepek);

        System.out.println("Trenutna brzina je: " + bmw.trenutnaBrzina);

        bmw.dodajGas();
        bmw.dodajGas();
        bmw.dodajGasZa(5);
        System.out.println("Trenutna brzina je: " + bmw.trenutnaBrzina);

        bmw.trenutnaPotrosnja();
        System.out.println("Trenutna potrosnja je: " + bmw.trenutnaPotrosnja());

        bmw.koci();
        System.out.println("Trenutna brzina je: " + bmw.trenutnaBrzina);

        bmw.trenutnaPotrosnja();
        System.out.println("Trenutna potrosnja je: " + bmw.trenutnaPotrosnja());

        bmw.stampajTablu();
    }



}


//(Dopuna 3)
//        Dopuniti klasu Auto tako da ima:
//        ●	atribut broj registracije
//        ●	da li je ukljucena klima u autu
//        ●	metodu dodajGas, koja povecava trenutnu brzinu za 10.
//        ●	metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//        ●	metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//        ○	faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//        ○	(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime
//
//        (Dopuna 4)
//        Dopuniti klasu Auto tako da ima:
//        ●	atribut za maksimalnu brzinu na auto (npr: 240)
//        ●	Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
//        ●	metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
//        Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa
//        |||||||||||||||||||||||||||||||||||||||||..................................................................... 100/240km/h
//        (objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje oznacavaju ostatak do maksimalne brzine)
//        Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.

//Dopuniti klasu Auto tako da ima:
//●	kapacitet rezervoara
//●	trenutnu kolicinu goriva u rezervoaru (u litrima)
//●	metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci a vraca novcanu vrednost goriva.
// Litar goriva je 210din.. Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara, takodje ukoliko se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.
//
