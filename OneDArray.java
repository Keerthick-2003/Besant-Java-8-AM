import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int userInput = sc.nextInt();
        int[] a = new int[userInput];

        for (int i = 0; i < userInput; i++) {
            a[i] = sc.nextInt();
            System.out.println(a[i]);
            sc.close();
        }
    }
}

//create one d array like above

