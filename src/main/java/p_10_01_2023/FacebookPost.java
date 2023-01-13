package p_10_01_2023;

public class FacebookPost {

    private String opis;
    private Korisnik autorJe;


//    constructors

//    public FacebookPost(String opis) {
//        this.opis = opis;
//    }

    public FacebookPost(Korisnik autorJe, String opis) {
        this.autorJe = autorJe;
        this.opis = opis;
    }

//    getters and setters

//    public String getOpis() {
//        return opis;
//    }
//
//    public void setOpis(String opis) {
//        this.opis = opis;
//    }
//
//    public Korisnik getPostovaoJe() {
//        return postovaoJe;
//    }

//    public void setAutorJe(Korisnik autorJe) {
//        this.autorJe = autorJe;
//    }


//    METHODS
    public void print(){
//        System.out.println("Korisnik: " + this.autorJe.getIme() + " " + this.autorJe.getPrezime());
        System.out.println("Post: " + this.opis);
        this.autorJe.stampa();
    }

}

//4.Zadatak
//Kreirati klasu Korisnik koja ima
//●	ime
//●	prezime
//●	gettere i settere za ime i prezime
//●	konstuktore koje mislite da su vam potrebni
//●	metoda koja stampa u formatu:
//(ime) (prezime)
//
//Kreirati klasu FacebookPost
//●	opis
//●	korisnik (referenca na korisnika koji je
// kreirao post)
//●	konstrukore koje mislite da su vam potrebni
//●	metoda print, stampa u formatu:
//(ime) (prezime)
//(opis post-a)
//
//U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda