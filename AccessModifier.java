public class AccessModifier {
    // Access modifiers in Java control the visibility of classes, methods, and variables.
    // The four main access modifiers are:
    // 1. public - accessible from any other class.
    // 2. private - accessible only within the class it is declared.
    // 3. protected - accessible within the same package and subclasses.
    // 4. default (no modifier) - accessible only within the same package.

    public int publicVariable; // can be accessed from anywhere
    private int privateVariable; // can only be accessed within this class
    protected int protectedVariable; // can be accessed within the same package and subclasses
    int defaultVariable; // can be accessed only within the same package

    public int atmPin = 1234;  
    private String accountNumber = "1234567890"; // sensitive information, should not be accessible outside this class
    protected String bankName = "MyBank"; // can be accessed by subclasses and classes in the same package
    // Constructor
    public AccessModifier(int pin, String account) {
        this.publicVariable = pin;
        this.privateVariable = pin;
        this.protectedVariable = pin;
        this.defaultVariable = pin;
        this.accountNumber = account; // sensitive information
    }
    // Public method to access private variable
    public String getAccountNumber() {
        return accountNumber; // returns the sensitive information
    }
    // Public method to access protected variable
    public String getBankName() {
        return bankName; // returns the bank name
    }
    // Public method to access public variable
    public int getPublicVariable() {
        return publicVariable; // returns the public variable
    }   


    //Encapsulation Example

    // This class demonstrates encapsulation by using private variables and public getters/setters.
    // It allows controlled access to the variables while keeping them hidden from outside classes.

    // private String name; // private variable
    // private int age; // private variable   
    // // Public getter for name
    // private String getName() {
    //     return name; // returns the private variable
    // }
    // Public setter for name
    // private void setName(String name) {
    //     this.name = name; // sets the private variable
    // }
    // // Public getter for age
    // private int getAge() {
    //     return age; // returns the private variable
    // }
  
}
