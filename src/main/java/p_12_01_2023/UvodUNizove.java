package p_12_01_2023;

import java.util.ArrayList;

public class UvodUNizove {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<User>();

        User m = new User("Andrija", "Antic");
        User n = new User("Bla", "Blabla");

        users.add(m);
        users.add(n);

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getIme() + " " + users.get(i).getPrezime());
        }
    }
}
