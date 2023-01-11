package p_10_01_2023;

public class Radnik {

    private String jmbg;
    private String imeIPrezime;
    private int brojDece;
    private int stepenStrucneSpr;
    private int godRadnogStaza;

    public Radnik(String jmbg){   // setuje se samo jednom kroz ocakav konstruktor
        this.jmbg = jmbg;
    }

    public Radnik(String jmbg, String imeIPrezime, int brojDece, int stepenStrucneSpr, int godRadnogStaza) {
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.stepenStrucneSpr = stepenStrucneSpr;
        this.godRadnogStaza = godRadnogStaza;
    }


    public String getJmbg() {
        return jmbg;
    }

//    public void setJmbg(String jmbg) { // setuje se samo jednom
//        this.jmbg = jmbg;
//    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojDece() {
        return brojDece;
    }

    public void setBrojDece(int brojDece) {
        this.brojDece = brojDece;
    }

    public int getStepenStrucneSpr() {
        return stepenStrucneSpr;
    }

    public void setStepenStrucneSpr(int stepenStrucneSpr) {
        this.stepenStrucneSpr = stepenStrucneSpr;
    }

    public int getGodRadnogStaza() {
        return godRadnogStaza;
    }

    public void setGodRadnogStaza(int godRadnogStaza) {
        this.godRadnogStaza = godRadnogStaza;
    }

    public void stampaj(){
        System.out.println("Ime i prezime: " + this.imeIPrezime);
        System.out.println("SSS : " + this.stepenStrucneSpr );
        System.out.println("Radni staz: " + this.godRadnogStaza);
        System.out.println("Broj dece: " + this.brojDece);
        System.out.println("JMBG: " + this.jmbg);
        System.out.println("Plata: " + this.plata());
        System.out.println("Minuli rad: " +this.minuliRad());
        System.out.println("Kredit: " + this.kredit());

    }


    public double minuliRad(){
        if(getGodRadnogStaza() < 10){
            return 0.05;
        } else
            if (this.godRadnogStaza < 20) {
            return  0.075;
        }else {
            return 0.1;
        }
    }

    public int slozenost(){
        return this.stepenStrucneSpr * this.brojDece;
    }

    public double plata(){
        return 25000 + (this.slozenost() + this.minuliRad()) * 1000;
    }

    public boolean kredit(){
        if(this.plata() < 50000){
            return false;
        } else {
            return  true;
        }
    }


}

//Zad Kreirati klasu Radnik koja ima:
//jmbg radnika
//ime i prezime
//broj dece (1,2,3,... ili 0 ako nema dece)
//stepen strucne spreme (od 1 do 8)
//godine radnog staza
//konstuktor koji postavlja samo jmbg
//konstuktor koji postavlja sve atribute
//getere i setere
//metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//metodu koja vraca koeficijent slozenosti:
//Racuna se tako sto se pomnozi stepen strucne spreme i broj dece.

//metodu koja racuna platu radnika, plata se racuna po formuli:
//25000 + (koeficijent slozenosti + minuli rad) * 10000

//metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
//
//
//
//Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//- do 10 godina 0.05
//- od 10-20 godina 0.075
//- preko 20 godina 0.1