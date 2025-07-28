// Statements
// Conditions
// Iteration
// Switch
// Jump Statements





public class ConState {
    public static void main (String args []) {
        int a = 10;
        int b=20;
        
        int mark = 80;

        if(a<b) {
            System.out.println("b is greater");
        } else {
            System.out.println("a is less than b");
        }

        if(mark == 100) {
            System.out.println("O Grade");
        } else if(mark >= 90 && mark < 100) {
            System.out.println("A Grade");
        } else if(mark >= 80 && mark <= 90) {
            System.out.println("B Grade");
        } else {
            System.out.println("C Grade");
        }
    





//switch statement
switch (a) {
    case 10:
        System.out.println("a is 10");
        break;
    case 20:
        System.out.println("a is 20");
        break;
    default:
        System.out.println("a is neither 10 nor 20");
        break;
}

    }
}