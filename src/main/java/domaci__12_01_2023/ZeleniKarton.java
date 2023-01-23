package domaci__12_01_2023;

public class ZeleniKarton {

    private String imeIPrezime;
    private String brojIndexa;
    private String predmet;
    private String profesor;
    private int ocena;


//    constructors
    public ZeleniKarton(String imeIPrezime, String brojIndexa, String predmet, int ocena, String profesor) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndexa = brojIndexa;
        this.predmet = predmet;
        this.ocena = ocena;
        this.profesor = profesor;

    }

//    getters and setters

    public int getOcena() {
        return ocena;
    }


    //    methods
    public boolean polozenIspit(){
        if(this.ocena > 5) return true;
        return false;
    }

    public void stampaj(){
        System.out.println("Predmet: " + this.predmet + " - ocena: " + this.ocena);
        System.out.println("Student: " + this.imeIPrezime + ", broj indexa: " + this.brojIndexa);
        System.out.println("Profesor: " + this.profesor);
        System.out.println();
    }



}
//1.	Zadatak
//Kreirati klasu ZeleniKarton koja ima:
//●	ime i prezime studenta
//●	broj indeksa
//●	naziv predmeta
//●	ime i prezime profesora
//●	ocenu - od 5 do 10
//●	gettere i settere
//●	konstruktore
//●	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//●	metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//●	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//●	(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

