package domaci_26_12_2022;

public class Zadatak3 {

    public static void main(String[] args) {
        String a = "2";
        String b = "3";
        String c = "6";
        String d = "2";

//
        glue(a, b);
        glue(c, d);

//        System.out.println(glue(a, b));
//        System.out.println(glue(c, d));

    }

    public static String glue(String x, String y){
        return x + y;
    }
}

//3.	Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost
// koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
