package p_26_12_2022;

public class Zadatak5 {

    public static void main(String[] args) {

        absolute(-5);
        absolute(35);
        absolute(0);
        absolute(-55);

    }

    public static void absolute(int a) {

        if (a < 0){
            System.out.println("Absolutna vrednost od a je " + -a);     //   a * -1 = -a
        }else {
            System.out.println("Absolutna vrednost od a je " + a);
        }
    }
}


//    Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.
