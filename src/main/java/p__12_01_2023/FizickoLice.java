//package p_12_01_2023;
//
//public class FizickoLice {
//
//    private String imeIPrezime;
//    private String brojLK;
//    private String jmbg;
//    private boolean novi;
//    private String adresa;
//
////    constructors
//
//    public FizickoLice(String imeIPrezime, String brojLK, String jmbg, String noviStari, String adresa) {
//        this.imeIPrezime = imeIPrezime;
//        this.brojLK = brojLK;
//        this.jmbg = jmbg;
//        this.novi = novi;
//        this.adresa = adresa;
//    }
//
////    getters and setters
//
//
//    public String getImeIPrezime() {
//        return imeIPrezime;
//    }
//
//    public void setImeIPrezime(String imeIPrezime) {
//        this.imeIPrezime = imeIPrezime;
//    }
//
//    public String getBrojLK() {
//        return brojLK;
//    }
//
//    public void setBrojLK(String brojLK) {
//        this.brojLK = brojLK;
//    }
//
//    public String getNoviStari() {
//        return noviStari;
//    }
//
//    public void setNoviStari(String noviStari) {
//        this.noviStari = noviStari;
//    }
//
//    public String getAdresa() {
//        return adresa;
//    }
//
//    public void setAdresa(String adresa) {
//        this.adresa = adresa;
//    }
//
//    //    METHODS
//
//
//    public void stampajPodatke(){
//        System.out.println("//ime i prezime, broj licne karte");
//    }
//}
//
////Zadatak
////Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
////ime i prezime
////broj licne karte
////jmbg
////podatak da li je osoba vec jednom kupovala nekretninu preko agencije
//// (boolean)
////konstuktore
////gettere i settere, jmbg ne sme da se menja
////metodu stampaj, koja stmpa podatke u formatu:
////ime i prezime, broj licne karte
////
////	Kreirati klasu Ugovor koja ima:
////godinu, dan i mesec sklapanja ugovora
////osobu koja prodaje nekretninu (fizicko lice)
////osobu koja kupuje nekretninu (fizicko lice)
////cenu za koju se prodaje nekretnina
////adresu nekretnine (ulica br., grad)
////metodu koja vraca procenat zarade
////za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
////metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i usluge agencije, prema formuli:
////1000 + cena za koju se prodaje * procenat zarade
////metodu koja stampa ugovor u formatu:
////Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca) o kupovini nekretnine (adresa)
//// po ceni od (cena nekretnin) pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)
//
