package Unit_02.Chapter_04.Q_02_04_03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int dif = Math.abs(x) + Math.abs(y);
        int count = 1;

        while (dif > 10) {
            x = input.nextInt();
            y = input.nextInt();
            dif = Math.abs(x) + Math.abs(y);
            count++;
        }

        System.out.printf("Darts thrown: %d \n", count);
        System.out.printf("Bullseye distance: %d", dif);

        input.close();
    }
}