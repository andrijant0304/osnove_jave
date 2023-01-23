package p__10_01_2023;

public class Reziser {

    private  String imeIPrezime;
    private int starost;

    private Film reziraoJe;

    public Reziser(String imeIPrezime, int starost) {
        this.imeIPrezime = imeIPrezime;
        this.starost = starost;
    }

//    public String getImeIPrezime() {
//        return imeIPrezime;
//    }

//    public void setImeIPrezime(String imeIPrezime) {
//        this.imeIPrezime = imeIPrezime;
//    }

//    public int getStarost() {
//        return starost;
//    }

//    public void setStarost(int starost) {
//        this.starost = starost;
//    }

//    public Film getReziraoJe() {
//        return reziraoJe;
//    }

    public void setReziraoJe(Film reziraoJe) {
        this.reziraoJe = reziraoJe;
    }

    public void stampaj(){
        System.out.println("Ime i prezime:  " + this.imeIPrezime);
        System.out.println("Starost: " + this.starost);
        if(this.reziraoJe != null){
            System.out.println("Rezirao je: " + this.reziraoJe.getNaziv());
            System.out.println("Godine: " + this.reziraoJe.getGodina());
        } else {
            System.out.println("Nije rezirao ni jedan film");
        }
    }
}

//.Zadatak
//Kreirati klasu Film koja ima:
//naziv filma
//iz koje godine je film
//konstruktore, gettere i settere
//metodu print koja stampa podatke u formatu
//naziv filma, godina
//
//
//Kreirati klasu Reziser koja ima:
//ime i prezime rezisera
//starost
//konstruktore, gettere i settere koji su potrebni
//metodu print koja stampa podatke u formatu
//ime prezime, starost.god
//
//U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
