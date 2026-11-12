package Unit_02.Chapter_02.Q_02_02_04;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 500;
        int dailyLimit = 250;

        String newPin = scanner.nextLine();
        if (newPin.length() != 4) {
            System.out.println("Invalid PIN length entered. Goodbye.");
        } else {
            System.out.println("New PIN stored.");
            

            String enteredPin = scanner.nextLine();
            if (enteredPin.length() != 4) {
                System.out.println("Invalid PIN length entered. Goodbye.");
            } else {
                if (!enteredPin.equals(newPin)) {
                    System.out.println("Invalid PIN entered. Goodbye.");
                } else {
                    int amount = scanner.nextInt();
                    
                    if (amount > balance) {
                        System.out.println("Insufficient funds. Goodbye.");
                    } else if (amount > dailyLimit) {
                        System.out.println("Exceeds daily limit. Goodbye.");
                    } else {
                        balance -= amount;
                        System.out.println("Withdrawal approved.");
                        System.out.println("Balance: $" + balance);
                    }
                }
            }
        }
        
        scanner.close();
    }
}