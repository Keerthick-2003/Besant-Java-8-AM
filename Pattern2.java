import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();

        for(int a = 1; a <= num; a++) {
            for(int b = 1; b <= num; b++) {
                if(a == 1 || a == num || b == 1 || b == num)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
