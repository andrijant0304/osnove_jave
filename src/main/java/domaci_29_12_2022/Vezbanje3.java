package domaci_29_12_2022;

public class Vezbanje3 {

    public static void main(String[] args) {

        SmartAirConditioning inverter = new SmartAirConditioning();
        inverter.setBrand("Samsung");
        inverter.setCoolingPowerCons(1);
        inverter.setHeatingPowerCons(2);
        inverter.setAirConTemp(27);
        inverter.setMode("greje");

        inverter.printData();
        System.out.println("Mesecnu potrosnja klime " + inverter.getBrand() + " je " + inverter.monthlyConsumption() + " kw/h." + "\n" +
                            "Ukupna cena struje za ovaj mesec je " + inverter.montlyCost() +  " dinara. \n");


        SmartAirConditioning standard = new SmartAirConditioning();
        standard.setBrand("Galanz");
        standard.setCoolingPowerCons(1);
        standard.setHeatingPowerCons(3);
        standard.setAirConTemp(22);
        standard.setMode("hladi");

        standard.printData();
        System.out.println("Mesecnu potrosnja klime " + standard.getBrand() + " je " + standard.monthlyConsumption() + " kw/h." + "\n" +
                "Ukupna cena struje za ovaj mesec je " + standard.montlyCost() +  " dinara. \n");
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
