package domaci__19_01_2023;

public class RekreativniPlaninar extends Planinar{

    private int tezinaOpreme;
    private String okrug;
    private int maxUspon;

//    constructors

    public RekreativniPlaninar(int idBroj, String punoIme, int tezinaOpreme, String okrug, int maxUspon) {
        super(idBroj, punoIme);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maxUspon = maxUspon;
    }

//    getters and setters

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public int getMaxUspon() {
        return maxUspon;
    }

//    METHODS

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + this.idBroj + ", ime: " + this.punoIme + ". Okrug: " + this.okrug );
    }

    @Override
    public int clanarina() {
        return 1000;
    }
    @Override
    public boolean uspesanUspon(Planina planina) {
        int potencijal = this.maxUspon - this.tezinaOpreme * 50;
        if (potencijal >= planina.getVisina()) return true;
        return false;
    }


}

//●	da li će rekreativni planinar uspešno popeti na planinu zavisi da li je
// njegov najveći uspon manji od visine planine, s tim da oprema dodatno otežava penjanje
// i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.

//●	rekeativci placaju clanarinu u iznosu od 1000 rsd