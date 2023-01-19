package domaci__16_01_2023;

public class Igrac extends Osoba {

    private int broj;
    private String pozicija;
    private boolean kapiten;

//    constructors
    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

//    getters and setters

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

//    METHODS
    @Override
    public void stampaj() {
        System.out.println("Igrac: ");
        super.stampaj();
        System.out.println("Broj: " + this.broj);
        System.out.println("Pozicija: " + this.pozicija);
        System.out.print("Kapiten: ");
        if(this.kapiten == true){
            System.out.println("da");
        } else {
            System.out.println("ne");
        }
        System.out.println();
    }
}
