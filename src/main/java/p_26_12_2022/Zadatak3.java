package p_26_12_2022;

public class Zadatak3 {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            stars();
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            stars();
        }
        System.out.println();

        stars();
    }

    public static void stars(){
        System.out.print("*  ");
    }
}

//    Napisati metodu koja stampa zvezdicu sa razmakom.
//        U glavnom programu je potrebno odstampati sledecu sliku koristeci metode koje smo definisali.
//        *  *  *
//        *  *
//        *
//
