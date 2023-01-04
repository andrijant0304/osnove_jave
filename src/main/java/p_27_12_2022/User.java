package p_27_12_2022;

public class User {

    public String firstName;
    public String lastName;
    public int age;
    public  int yearOfBirth;

    public String email;

//    public static void printUser(String firstName, String lastName, int age) {
//        System.out.println(firstName + " " + lastName + ", " + age + " god.");
//    }

// no static
// ova metoda ne pripada klasi, ova metoda pripada objektu
// ova metoda se poziva nad objektom
    public  void  print(){
        System.out.println(this.firstName + " " +
                            this.lastName + ", " +
                            this.age + " god.");
    }

    public void printAge(int currentYear) {
        System.out.println(currentYear - this.yearOfBirth);
    }

    public int returnAge(int currentYear) {
        int a = currentYear - this.yearOfBirth;
        return a;
    }

}

