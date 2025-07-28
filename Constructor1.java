public class Constructor1 {
    String currency;
    double price;

    Constructor1(String currency, double price) {
        this.currency = currency;
        this.price = price;
    }
    public static void main(String[] args) {
        // creating 2 objs using the same constructor name
        Constructor1 cons1 = new Constructor1("USD", 85.81);
        Constructor1 cons2 = new Constructor1("EUR", 100.51);

        System.out.println(cons1.currency);
        System.out.println(cons1.price);
        System.out.println(cons2.currency);
        System.out.println(cons2.price);
    }
}
