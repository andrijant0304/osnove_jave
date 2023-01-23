package domaci__10_01_2023;

public class Knjiga {


    private  String isbn;
    private  String naziv;
    private  int godinaIzdanja;
    private Autor napisaoJe;

    public Knjiga(String isbn, String naziv, int godinaIzdanja) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getNapisaoJe() {
        return napisaoJe;
    }

    public void setNapisaoJe(Autor napisaoJe) {
        this.napisaoJe = napisaoJe;
    }

    public  void stampaKnjigu(){
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Naziv knjige: " + this.naziv + " - " + "izdanje: " + this.godinaIzdanja);
        System.out.println("Autor: " + this.napisaoJe.getIme() + " " + this.napisaoJe.getPrezime());
        System.out.println();
    }
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
//

}
//1.	Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
//
//	U glavnom programu napraviti vise autora sa vise knjiga.
