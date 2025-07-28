import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Rows : ");
        int num = sc.nextInt();

        for(int a = 1; a <= num; a++) {
            for(int b = 1; b <= a; b++) {
                System.out.print(" $ ");
            }
            System.out.println();
        }
        sc.close();
    }
}
