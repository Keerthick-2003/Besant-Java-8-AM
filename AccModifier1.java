// package only need when both classes are in different folders
// package doesn't need when both classes are in the same folder

public class AccModifier1 {

    public String name = "Cob";
    private int age = 7;
    String country = "Finland";
    protected String partner = "Pen";

    public void displayAge() {
        System.out.println("Private Age : "+ age); //private age
    }
}
