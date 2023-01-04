package p_27_12_2022;

public class UvodUOOP {

    public static void main(String[] args) {

//        String ime = "Milan";
//        String prezime = "Jovanovic";
//        int starost = 27;

        User milan = new User();    //  objekat (instanca) klase "User"
                                    // promenjljiva "milan" koja moze da cuva adresu do objekta tipa "milan" p_27_12_2022.User@6d03e736
        milan.firstName = "Milan";
        milan.lastName = "Jovanovic";
//        milan.age = 27;
//        milan.print();
        milan.yearOfBirth = 1995;
        milan.printAge(2023);
        int age = milan.returnAge(2025);
        System.out.println(age);




//        User.printUser(milan.firstName, milan.lastName, milan.age);

//        System.out.println(milan.firstName + " " + milan.lastName + ", " + milan.age + " god.");

//        System.out.println(ime + ", " + prezime + ", " + starost + " god.");

//        User nikola = new User();
//        nikola.firstName = "Nikola";
//        nikola.lastName = "Nikolic";
//        nikola.age = 33;

//        User.printUser(nikola.firstName, nikola.lastName, nikola.age);

//        System.out.println(nikola.firstName + " " + nikola.lastName + ", " + nikola.age + " god." + ", " + nikola.email);

    }


}
