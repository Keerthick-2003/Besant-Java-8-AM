//encapsulation.java
// It defines a class Encapsulation with private variables and public getters/setters.
// The main method creates an instance of Encapsulation, sets values using setters, and retrieves them using getters.
// Encapsulation is a fundamental concept in object-oriented programming that restricts direct access to an object's
// variables and methods, allowing controlled access through public methods.
// This helps in maintaining the integrity of the data and provides a clear interface for interacting with the

public class Encapsulation {

    private String Gmail;
    private int Password;

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }
    public String getGmail() {
        return Gmail;
    }
     public void setPassword(int Password) {
        this.Password = Password;
    }
    public int getPassword() {
        return Password;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();

        //set the values
        e.setGmail("abcxyz@gmail.com");
        e.setPassword(1234509876);

        //get the values
        System.out.println("Gmail : " + e.getGmail());
        System.out.println("Password : " + e.getPassword());
    }
}
