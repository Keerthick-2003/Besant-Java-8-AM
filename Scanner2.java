import java.util.Scanner;
public class Scanner2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The 1st Number: ");
        int num1 = sc.nextInt();
		char c1 = (char)num1;
		System.out.println("Enter The 2nd Number: ");
        int num2 = sc.nextInt();
		char c2 = (char)num2;
        System.out.println("Enter The 3rd Number: ");
        int num3 = sc.nextInt();
		char c3 = (char)num3;
		System.out.println("Enter The 4th Number: ");
        int num4 = sc.nextInt();
		char c4 = (char)num4;
        System.out.println("Enter The 5th Number: ");
        int num5 = sc.nextInt();
		char c5 = (char)num5;
		System.out.println("Enter The 6th Number: ");
        int num6 = sc.nextInt();
		char c6 = (char)num6;
        System.out.println("Enter The 7th Number: ");
        int num7 = sc.nextInt();
		char c7 = (char)num7;
		System.out.println("Enter The 8th Number: ");
        int num8 = sc.nextInt();
		char c8 = (char)num8;
        System.out.println("The Final String Is: "+c1+""+c2+""+c3+""+c4+ ""+c5+""+c6+""+c7+""+c8);	
        sc.close();
    }
}
