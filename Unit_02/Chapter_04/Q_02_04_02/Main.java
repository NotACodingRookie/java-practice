package Unit_02.Chapter_04.Q_02_04_02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        int number1 = Integer.parseInt(scannerObj.nextLine());
        int number2 = Integer.parseInt(scannerObj.nextLine());
        int number3 = Integer.parseInt(scannerObj.nextLine());
        int count = 1;
        int pointTotal = number1 + number2 + number3;

        while ((number1 + number2 + number3) != 180) {
            count++;
            number1 = Integer.parseInt(scannerObj.nextLine());
            number2 = Integer.parseInt(scannerObj.nextLine());
            number3 = Integer.parseInt(scannerObj.nextLine());
            pointTotal = pointTotal + number1 + number2 + number3;
        }
        if (count == 1){
            System.out.printf("It took %d turn to hit 180.\n", count);
        } else {
            System.out.printf("It took %d turns to hit 180.\n", count);
        }
        
        System.out.printf("Total points thrown: %d", pointTotal);
    }
}