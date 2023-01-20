package p__19_01_2023;

public class Trkac extends Atleticar{


//    constructors
    public Trkac() {
    }

    public Trkac(String imeIprezime, double rezultat) {
        super(imeIprezime, rezultat);
    }

//    METHODS
    @Override
    public boolean daLiJeBolji(Atleticar a) {
//        return this.rezultat < a.rezultat;
        if(this.rezultat < a.rezultat){
            return  true;
        } else {
            return  false;
        }
    }
}
