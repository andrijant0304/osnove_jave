package p__16_01_2023;

public class Osoba {

    protected String imeIPrezime;
    protected String jmbg;

//    constructors


    public Osoba(String imeIPrezime, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
    }

    //    METHODS
    public void stampajBasic(){
        System.out.println("Ime i prezime: " + this.imeIPrezime + ", " + this.jmbg);

    }
}

//Zadatak
//		Kreirati klasu Osoba koja od atributa ima:
// ime i prezime
// jmbg
//konstuktor sa parametrima
//metodu stampaj koja stampa podatke u formatu
//			ime prezime, jmbg
//
//
//		Kreirati klasu Student koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//broj indeksa
//dug za skolarinu
//konstuktor sa parametrima
//metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//
//Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//naziv predmeta koji predaje
//iznos plate
//konstuktor sa parametrima
//metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//
//			U glavnom programu kreirati 2 studenta i 2 profesora.
//
//	(dopuna)
//	Umesto metoda stampajStudent i stampajProfu,
//	napisati override metoda za stampu