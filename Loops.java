public class Loops {
    public static void main(String[] args) {

        System.out.println("for loop : ");

        for(int i = 0; i <= 7; i++){
            System.out.println(i);
        }  
  
// 

        for(int j = 0; j <= 7; j=j+2) {
            System.out.println(j);
        }

        //
        
        int [] c = {1,2,3,4,5};
        
        for(int i = 0; i<c.length ; i++) {
            System.out.println(c[i]);
        } 

        // enhanced for loop
        System.out.println("Enhanced for : ");
        for(int i : c) {
            // i is the element of the array c
            // i is not the index of the array c
            System.out.println(i);
        }

        // while loop
        System.out.println("While loop : ");
        int i = 0;
        while(i < 5) {
            System.out.println(i);
            i++;
        }

        // nested loop
        System.out.println("Nested loop : ");
        for(int k = 0; k < 3; k++) {
            for(int l = 0; l < 3; l++) {
                System.out.println("k: " + k + ", l: " + l);
            }
        }

        int cols = 1;
        for(int k = 0; k < 3; k++) {
            for(int l = 0; l < cols; l++) {
                System.out.print("*");
            }
            cols+=2;
            System.out.println("");
        }

        // do while loop
        System.out.println("Do while loop : ");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while(j < 5);


        // break statement (Exception in switch also)
        // Continue statement (used only in loops
        System.out.println("break and continue in loops");

    for (int a = 0; a < 5;) {
        if(a == 2) {
            break; // exits the loop when i is 5
        }
        a++;
        System.out.println(a);
    }

    for (int a = 0; a < 5;) {
        if(a == 2) {
            a++; // increments a to avoid infinite loop
            continue; // skips the rest of the loop when i is 2
        }
        System.out.println(a);
        a++;
    }
    }

}
