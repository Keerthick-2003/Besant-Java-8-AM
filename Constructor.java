public class Constructor {
    // Constructor is a special method used to initialize objects.
    // It is called when an object of a class is created.
    // Constructors have the same name as the class and do not have a return type.

    // Example of a simple constructor
    public Constructor() {
        System.out.println("Constructor called: Object created!");
    }

    public static void main(String[] args) {
        // Creating an object of the Constructor class
        Constructor obj = new Constructor(); // This will call the constructor
    }
}
