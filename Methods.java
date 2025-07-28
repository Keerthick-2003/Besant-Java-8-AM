public class Methods {
    // Method Declaration and Overloading
    public void myMethod(int param) {
        System.out.println("Integer parameter: " + param);
    }

    public void myMethod(String param) {
        System.out.println("String parameter: " + param);
    }

    public static void main(String[] args) {
        Methods obj = new Methods();
        // Method Call
        obj.myMethod(5);
        obj.myMethod("Hello");
    }
}

//passing two parameters
class MethodsWithTwoParams {
    public void myMethod(int param1, String param2) {
        System.out.println("Integer parameter: " + param1);
        System.out.println("String parameter: " + param2);
    }

    public static void main(String[] args) {
        MethodsWithTwoParams obj = new MethodsWithTwoParams();
        // Method Call
        obj.myMethod(5, "Hello");
    }
}