package domaci_27_12_2022;

public class SmartAirConditioning {

    String brand;
    int airConTemp;
    String modeHeat;
    String modeCool;
    int outsideTemp;

    String workingMode;


    public String getAirConTemp(int outsideTemp) {
        if (this.airConTemp < outsideTemp){
            return "veca";
        }
        return "manja";
    }

    public  void print(int outsideTemp){
        System.out.println("Spoljna temperatura " + outsideTemp + " je " + this.workingMode
                + " od temperature " + this.airConTemp + " na koju je klima " +  this.brand + " podesena.");
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