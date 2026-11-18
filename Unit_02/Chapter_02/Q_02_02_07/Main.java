package Unit_02.Chapter_02.Q_02_02_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = Integer.parseInt(input.nextLine());
        
        if (year % 4 == 0){
            if (year % 100 == 0 && year % 400 != 0){
                System.out.println("not a leap year");
            } else if (year % 100 == 0 && year % 400 == 0){
                System.out.println("leap year");
            } else {
                System.out.println("leap year");
            }
        } else {
            System.out.println("not a leap year");
        }

        input.close();
    }
}