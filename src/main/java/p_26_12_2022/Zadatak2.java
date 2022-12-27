package p_26_12_2022;

public class Zadatak2 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            printName();
            System.out.print(" ");
            printLastName();
            System.out.println();
        }
    }

    public static void printName() {
        System.out.print("Andrija");
    }

    public static void printLastName() {
        System.out.print("Antic");
    }

}

//Zadatak
//        Napisati dve metode, jedna metoda sluzi za stampanje imena
//        a druga sluzi za stampanje prezimena.
//        U glavnom programu pozvati metode na izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.
//        Primer izvrsenja:
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
