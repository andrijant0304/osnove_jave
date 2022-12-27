package p_26_12_2022;

public class Zadatak4 {

    public static void main(String[] args) {

        math(5, 6);
        System.out.println();
        math(22, 5);
        System.out.println();
        math(61, 82);
        System.out.println();
        math(25, 346);
    }

    public static void math(int a, int b) {
        System.out.println("Proizvod a i b: " + (a * b));
        System.out.println("Razlika a i b: " + (a - b));
        System.out.println("Zbir a i b: " + (a + b));
        System.out.println("Kolicnik a i b: " + (a / b));
    }
}

//    Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
//    Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju
//    sa razlicitim prosledjenim vrednostima.
