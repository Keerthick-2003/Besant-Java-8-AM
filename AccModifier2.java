public class AccModifier2 {
    public static void main(String[] args) {
        AccModifier1 am = new AccModifier1();

        System.out.println("Name : "+ am.name);  //public
        System.out.println(am.country);  // default
        System.out.println(am.partner); //protected

       //System.out.println("Name : "+ am.age); Error // accessing private var directly not allowed. so we can access it through public method
       //the correct way to access
       am.displayAge();  // access private age

    }
}
