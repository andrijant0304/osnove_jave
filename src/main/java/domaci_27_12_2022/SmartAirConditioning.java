package domaci_27_12_2022;

public class SmartAirConditioning {

    String brand;
    int airConTemp;
    String modeHeat;
    String modeCool;


    public String getAirConTemp(int airConTemp, int outsideTemp) {
        if (airConTemp > outsideTemp){
            return modeHeat;
        }
        return modeCool;
    }


}

//2.	Kreirati klasu SmartAirConditioning koja ima:
//        ●	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        ●	atribut za izabranu temperaturu
//        ●	atribut za mod (hladi/greje) - string
//        ●	metodu za stampu (proizvoljno)
//        ●	metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//
//        Metoda kao parametar prima temperaturu koja je napolju.
//
//
//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode
//