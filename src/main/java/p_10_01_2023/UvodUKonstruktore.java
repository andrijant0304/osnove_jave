package p_10_01_2023;

public class UvodUKonstruktore {

    public static void main(String[] args) {

        User u = new User();

        u.setIme("Andrija");
        u.setPrezime("Antic");
        u.setEmail("andrija@gamil.com");

        User m = new User("Andrija", "Antic");

        u.getIme();
        m.getIme();

    }
}
