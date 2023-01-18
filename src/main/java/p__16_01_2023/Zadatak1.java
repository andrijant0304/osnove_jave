package p__16_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {


        Student student1 = new Student("Andrija Antic", "123456789", "2323", 50000);
        Student student2 = new Student("John Smith", "987654321", "5656", 22000);

        Profesor profa1 = new Profesor("Mika Mikic", "687685413341", "SQL", 100000);
        Profesor profa2 = new Profesor("Nika Nikic", "687685413341", "Java", 200000);

        student1.stampajStudenta();
        student2.stampajStudenta();

        profa1.stampajProfu();
        profa2.stampajProfu();


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
//metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost.
// Metoda prima iznos uplate kao parametar metode.
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
//	Umesto metoda stampajStudent i stampajProfu, napisati override metoda za stampu