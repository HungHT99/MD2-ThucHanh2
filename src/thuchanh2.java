import java.util.Scanner;

public class thuchanh2 {
    public static void main(String[] args) {
        double  money = 1.0;
        int month = 1;
        double interesRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = sc.nextDouble();
        System.out.println("Enter number of months: ");
        month = sc.nextInt();
        System.out.println("Enter: ");
        interesRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++){
            totalInterest += money * (interesRate/100)/12 * month;
        }
        System.out.println("Total of interest: " +totalInterest);
    }
}
