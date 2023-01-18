package p__16_01_2023;

public class Kamion {


    private int nosivost;

    public Kamion() {
        super(); // ovo je poziv konstuktora iz osnovne klase

        System.out.println("Konstuktor iz Kamion klase.");
    }

    public Kamion(String registracija, String marka, int brzina,
                  int maxBrzina, int kubikaza, int nosivost) {
//        super(registracija, marka, brzina, kubikaza, maxBrzina);

        this.nosivost= nosivost;
    }

//    @Override
    public void stampaj() {
        System.out.println("KAMION: ");
//        super.stampaj();
        System.out.println("Nosivost: " + this.nosivost);
    }
}
