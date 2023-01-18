package p__16_01_2023;

public class Student extends Osoba {

    private String brojIndexa;
    private int dugSkolarina;

//  constructors
    public Student(String imeIPrezime, String jmbg, String brojIndexa, int dugSkolarina) {
        super(imeIPrezime, jmbg);

        this.brojIndexa = brojIndexa;
        this.dugSkolarina = dugSkolarina;

    }

//    METHODS
    public void uplatiSkolarinu(int uplata){
        this.dugSkolarina = this.dugSkolarina - uplata;
    }

    public void stampajStudenta(){
        System.out.println("Student: ");
        this.stampajBasic();
        System.out.println("Broj indexa: " + this.brojIndexa);
        System.out.println("Dug za skolarinu: " + this.dugSkolarina);
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
//metodu povecaj platu. Metoda kao parametar prima procenat
// povecanja.
//Napisati metodu stampajProfu da stampa sve podatke o
// profesoru
//
//
//			U glavnom programu kreirati 2 studenta i 2 profesora.
//
//	(dopuna)
//	Umesto metoda stampajStudent i stampajProfu, napisati override metoda za stampu