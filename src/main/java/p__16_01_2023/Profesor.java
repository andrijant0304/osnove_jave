package p__16_01_2023;

public class Profesor extends Osoba{

    private String predmet;
    private int plataProf;


//  constructors
    public Profesor(String imeIPrezime, String jmbg, String predmet, int plataProf) {
        super(imeIPrezime, jmbg);

        this.predmet = predmet;
        this.plataProf = plataProf;
    }



    //    METHODS
    public void povecajPlatu(int procenat){
        this.plataProf = plataProf * (1 + procenat/100);
    }

    public void stampajProfu(){
        System.out.println("Profesor: ");
        stampajBasic();
        System.out.println("Predmet: " + this.predmet);
        System.out.println("Plata: " + this.plataProf);


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
//metodu uplati skolarinu koja umanjuje dug za prosledjenu
// vrednost.
// Metoda prima iznos uplate kao parametar metode.
//Napisati metod stampajStudenta da stampa sve podatke
// o studentu
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
//	Umesto metoda stampajStudent i stampajProfu, napisati override metoda za stampu