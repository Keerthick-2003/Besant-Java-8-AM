import java.util.Scanner;

public class Scanner1 {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number: ");
		int num2 = sc.nextInt();
		System.out.println("The Sum OF Two Integers Are : "+num1+num2);
		sc.close();
	}
	
}