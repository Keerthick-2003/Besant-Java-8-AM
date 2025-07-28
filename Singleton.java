// Singleton Class
class Person {
    private static Person p = new Person();

    private Person() {
        System.out.println("Create a person");
    }

    public static Person getPerson() {
        return p;
    }

    public void displayMsg() {
        System.out.println("Hello from Singleton");
    }
}

public class Singleton {
    public static void main(String[] args) {
        Person p1 = Person.getPerson();
        Person p2 = Person.getPerson();
        System.out.println(p1);
        System.out.println(p2);
        p1.displayMsg();
        p2.displayMsg();
    }
}
