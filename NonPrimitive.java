public class NonPrimitive {
    // Non-primitive data types in Java
    // Non-primitive data types include: String, Arrays, Classes, Interfaces, Enums, etc.

        // static 
static int a;
static {
    a = 5;
}
    
    public static void main(String[] args) {
         // Example of an array (non-primitive data type)
    int[] num = {1, 2, 3, 4, 5};
    int n[] = new int[4];    // max index is 4
    int a[] = new int[7]; // max index is 7   
    int n1[][] = new int[3][7]; // 2D array with 3 rows and 7 columns

    System.out.println(num);
    System.out.println(num[3]);
    System.out.println(n); // Output: [I@<hashcode>
    System.out.println(a);
    System.out.println(n1); // Output: [[I@<hashcode>]
    System.out.println(n1[0]);
    System.out.println(n1[0][0]);

    System.out.println(a);

    }
}