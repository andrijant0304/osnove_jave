package domaci__16_01_2023;

public class Trener extends Osoba {

    private int iskustvo;
    private String tip;

//    constructors
    public Trener(String imeIPrezime, String jmbg, int godinaRodjenja, int iskustvo, String tip) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.iskustvo = iskustvo;
        this.tip = tip;
    }

//    METHODS
    @Override
    public void stampaj() {
        System.out.println("Trener: ");
        super.stampaj();
        System.out.println("Godine iskustva: " + this.iskustvo);
        System.out.println("Tip: " + this.tip);
        System.out.println();
    }
}
