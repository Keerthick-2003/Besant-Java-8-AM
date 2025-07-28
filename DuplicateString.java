// import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Input : ");
        int[] input =  {5,9,8,7,6,5,4,4,3,9};

        for(int i = 0; i<=input.length; i++) {
            for(int j = i+1; j<=input.length; j++) {
                System.out.println("i "+i);
                System.out.println("j "+j);
                if(input[i] == input[j]) {
                    System.out.println(input[i]);
                }
            }
        }
    }
}
