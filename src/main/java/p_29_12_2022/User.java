package p_29_12_2022;

public class User {

    private String firstName;
    private String lastName;
    private int yearOfBirth;

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return firstName;
    }
//    private void stampaj(){
//        System.out.println(this.firstName + " " + lastName + ", " + yearOfBirth + " god.");
//    }
}
