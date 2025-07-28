// constructor overloading
// This code demonstrates constructor overloading in Java.
// It defines a class ConsOverloading with two constructors: one that takes parameters and another that
// uses default values.
// The main method creates instances of ConsOverloading using both constructors and prints their values.
// Constructor overloading allows a class to have multiple constructors with different parameter lists.
// This is useful for creating objects with different initial states without needing to define multiple classes.

import java.util.Scanner;

public class ConsOverloading {
    String coin;
    double price;

    ConsOverloading(String coin, double price) {
        this.coin = coin;
        this.price = price;
    }
    ConsOverloading() {
        this("ETH", 211423.56);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Coin Name : ");   // input from user
        String coin = sc.nextLine();
        System.out.print("Enter Coin Price : ");    // input from user
        double price = sc.nextDouble();

        ConsOverloading cons1 = new ConsOverloading(coin,price); //user input
        ConsOverloading cons2 = new ConsOverloading();  //default

        System.out.println("First : " + cons1.coin);
        System.out.println("First : " + cons1.price);
        System.out.println("Second : " + cons2.coin);
        System.out.println("Second : " + cons2.price);

        sc.close();
    }
}
