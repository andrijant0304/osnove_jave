package p__19_01_2023;


import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        Figura p1 = new Pravougaonik(6,6);
        Figura p2 = new Pravougaonik(8, 6);
        Figura p3 = new Pravougaonik(3, 3);
        Figura t1 = new Trougao(8);
        Figura t2 = new Trougao(5);
        Figura t3 = new Trougao(3);

        ArrayList<Figura> figure = new ArrayList<>();

        figure.add(p1);
        figure.add(t1);
        figure.add(p2);
        figure.add(t2);
        figure.add(p3);
        figure.add(t3);


        double sumaO = 0;
        double sumaP = 0;

//        for (int i = 0; i < figure.size(); i++) {
//            figure.get(i).stampa();
//        }

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampa();
        }

        for (int i = 0; i < figure.size(); i++) {
            sumaO += figure.get(i).obim();
            sumaP += figure.get(i).povrsina();
        }
        System.out.println("Obim svih figura: " + sumaO);
        System.out.println("Povrsina svih figura: " + sumaP);




//        p1.stampa();
//        t1.stampa();
    }
}

//Zadatak
//U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika)
// zatim sabrati sve povrsine i obime i za svaku figuru ispisati ponaosob