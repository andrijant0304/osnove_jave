package p_29_12_2022;

public class Auto {

    public  String vozac;
    public  String marka;
    public  int brojVrata;
    public  double potrosnja;
    public  int trenutnaBrzina;
    public int godinaProizvodnje;
    public int mesecRegistracije;
    public int kubikaza;
    public boolean otvorenGepek;
    public  String brojRegistracije;
    public boolean ukljucenaKlima;

    public  int maksimalnaBrzina;




    public  void stampa(){
        System.out.println(this.vozac + "\n" +
                            this.marka + " - " + brojVrata + "-ro vrata \n" +
                            "Sa potrosnjom od " + potrosnja + " l na 100km \n" +
                            trenutnaBrzina + " km/h je trenutna brzina.");
        System.out.println();
    }

    public boolean prekoracenje(int ogranicenje){
        if (trenutnaBrzina > ogranicenje){
            return true;
        }
        return  false;

//        return this.trenutnaBrzina > ogranicenje;
    }

    public int kazna(int ogranicenje) {
        if (this.trenutnaBrzina > ogranicenje) {
            int kazna = (trenutnaBrzina - ogranicenje) * 1000;
            return kazna;
        } else {
            return  0;
        }

    }

    public  boolean oldtimer(){
        if (this.godinaProizvodnje < 1950){
            return true;
        }
        return false;
    }

    public  boolean registracija(int trenutniMesec){
        if (trenutniMesec < this.mesecRegistracije){
            return true;
        }
        return false;
    }

    public  int izracunajCenuRegistracije(){
        int cenaRegistracije = kubikaza * 100;
        if(kubikaza > 2000 ) {
            cenaRegistracije = cenaRegistracije * 130 / 100;
        }
            return cenaRegistracije;

    }

    public void otvoriGepek() {
        this.otvorenGepek = true;
    }

    public void dodajGas(){
        trenutnaBrzina = trenutnaBrzina + 10;
        if (trenutnaBrzina > maksimalnaBrzina){
            trenutnaBrzina = maksimalnaBrzina;
        }
    }

    public  void dodajGasZa(int dodajZa){
        trenutnaBrzina = trenutnaBrzina + dodajZa;
        if (trenutnaBrzina > maksimalnaBrzina){
            trenutnaBrzina = maksimalnaBrzina;
        }
    }

    public  void koci(){
        trenutnaBrzina = trenutnaBrzina - 10;
        if(trenutnaBrzina < 0){
            trenutnaBrzina = 0;
        }

    }

//    public double trenutnaPotrosnja(){
//        double faktor = 1.0;
//        if(this.ukljucenaKlima){
//            faktor = 1.2;
//
//        }
//        return this.trenutnaBrzina / 100.0 * this.potrosnja * faktor;
//
//    }

    public double racunajFaktor(){
        double faktor = 1.0;
        if(this.ukljucenaKlima){
            faktor = 1.2;
        }
        return faktor;
    }
    public double trenutnaPotrosnja(){
        return this.trenutnaBrzina / 100.0 * this.potrosnja * this.racunajFaktor();
    }

    public void stampajTablu(){
        int brzinomer = (this.trenutnaBrzina * 100) / this.maksimalnaBrzina;
        for (int i = 0; i < 100; i++) {
            if (i <= brzinomer) {
                System.out.print("|");
            } else {
                System.out.print(".");
            }
        }
        System.out.print(trenutnaBrzina + "/240km/h");
    }
//        Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.
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
//        (objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje oznacavaju
//        ostatak do maksimalne brzine)
//        Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.

//Dopuniti klasu Auto tako da ima:
//●	kapacitet rezervoara
//●	trenutnu kolicinu goriva u rezervoaru (u litrima)
//●	metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci a vraca novcanu vrednost goriva. Litar goriva je 210din.. Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara, takodje ukoliko se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.
//
//2. Zadatak
//Kreirati klasu Student koja ima:
//-	ime
//-	prezime
//-	broj indeksa (int)
//-	da li je na budzetu
//-	gettere i settere za sve atributge