package domaci_29_12_2022;

public class SmartAirConditioning {

    private String brand;
    private int coolingPowerCons;
    private int heatingPowerCons;
    private int airConTemp;
    private String mode;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setCoolingPowerCons(int coolingPowerCons) {
        this.coolingPowerCons = coolingPowerCons;
    }
//    public int getCoolingPowerCons() {
//        return coolingPowerCons;
//    }

    public void setHeatingPowerCons(int heatingPowerCons) {
        this.heatingPowerCons = heatingPowerCons;
    }
//    public int getHeatingPowerCons() {
//        return heatingPowerCons;
//    }

    public void setAirConTemp(int airConTemp) {
        this.airConTemp = airConTemp;
    }
//    public int getAirConTemp() {
//        return airConTemp;
//    }

    public void setMode(String mode) {
        this.mode = mode;
    }
//    public String getMode() {
//        return mode;
//    }

    public void printData(){
        System.out.println(this.brand + " - " + this.mode + " - " + this.airConTemp);
    }

    public int monthlyConsumption(){
        int monthly = 30 * 15;
        if(mode.equals("hladi")){
            return monthly * this.coolingPowerCons;
        }
        return monthly * this.heatingPowerCons;
    }

    public int montlyCost(){
        int monthly = 30 * 15;
        if(mode.equals("hladi")){
            monthly = monthly * this.coolingPowerCons;
        }
        monthly = monthly * this.heatingPowerCons;

       if (monthly > 350){
           return ((350 * 6) + (monthly - 350) * 9);
       } else {
           return monthly * 6;
       }

    }
}


//(ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
//●	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//●	atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//●	atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//●	atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//●	atribut za mod (hladi/greje)
//●	metodu za stampu - stampa u formatu
//marka - mod - termperatura
//●	metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//○	30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//●	metodu koja racuna koliko klima novca potrosi za mesec dana
//○	Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//○	Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//○	Metoda vraca ukupnu cenu za taj mesec
//
//U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.
