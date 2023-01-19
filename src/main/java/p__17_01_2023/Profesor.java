//package p__17_01_2023;
//
//public class Profesor {
//    private String predmet;
//    private double plata;
//    public Profesor(String imeIPrezime, String jmbg, String predmet, double plata) {
//        super(imeIPrezime, jmbg);
//        this.predmet = predmet;
//        this.plata = plata;
//    }
//    public void povecajPlatu(int procenat) {
//        this.plata = this.plata * (1 + procenat/100.0);
//    }
//    @Override
//    public void stampaj() {
//        System.out.println("Profesor");
//        super.stampaj();
//        System.out.println("Predmet: " + this.predmet);
//        System.out.println("Plata: " + this.plata);
//    }
//}

//Zadatak
//
//Kreirati apstraktnu klasu Student koja ima:
//ime i prezime studenta
//broj indeksa
//godinu studija
//gettere, settere i konstruktore
//apstraktnu metodu koja vraca cenu skolarine.
//apstraktnu metodu koja vraca da li je student na buzetu ili ne.
//metodu koja stampa podatke u formatu:
//ime i prezime, broj indeksa, godina studija
//Finansiranje: budzet/samofinansirajuci
//Cena skolarine: cena
//
//	Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//koja za cenu skolarine vraca 90000
//za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
//
//Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//koja za cenu skolarine vraca 100000
//za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
//	U glavnoj klasi kreirati studente i testirati funkciolanosti