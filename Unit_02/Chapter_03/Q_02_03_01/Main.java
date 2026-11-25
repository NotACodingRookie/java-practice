package Unit_02.Chapter_03.Q_02_03_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbersOfInput = Integer.parseInt(input.nextLine());

        int number = Integer.parseInt(input.nextLine());
        int max = number;
        int min = number;

        for (int i = 1; i < numbersOfInput; i++) {
            number = Integer.parseInt(input.nextLine());

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
            
        }
        System.out.println(String.format("min: %d", min));
        System.out.println(String.format("max: %d", max));
    }
}