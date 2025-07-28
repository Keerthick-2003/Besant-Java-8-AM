import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Days 1 to 7 : ");
        int days = sc.nextInt();
        String wonders;
        switch (days) {
            case 1:
                wonders = "Taj Mahal";  // we can also give s.o.p instead of variable
                break;
            case 2:
                wonders = "Great Wall of China";
                break;
            case 3:
                wonders = "Christ the Redeemer";
                break;
            case 4:
                wonders = "Machu Picchu";
                break;
            case 5:
                wonders = "Chichen Itza";
                break;
            case 6:
                wonders = "Colosseum";
                break;
            case 7:
                wonders = "Petra";
                break;
            default:
                wonders = "Invalid day!";
        }
        System.out.println("Wonder of the day: " + wonders);
        sc.close();
    }
}
