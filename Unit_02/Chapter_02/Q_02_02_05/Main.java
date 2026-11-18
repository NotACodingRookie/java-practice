package Unit_02.Chapter_02.Q_02_02_05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day = Integer.parseInt(input.nextLine());
        if (day == 1){
            System.out.println("Sunday");
        } else if (day == 2){
            System.out.println("Monday");
        } else if (day == 3){
            System.out.println("Tuesday");
        } else if (day == 4){
            System.out.println("Wednesday");
        } else if (day == 5){
            System.out.println("Thursday");
        } else if (day == 6){
            System.out.println("Friday");
        } else if (day == 7){
            System.out.println("Saturday");
        } else {
            System.out.println("invalid argument");
        }

        input.close();
    }
}