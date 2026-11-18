package Unit_02.Chapter_02.Q_02_02_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int line1 = Integer.parseInt(input.nextLine());
        int line2 = Integer.parseInt(input.nextLine());
        int line3 = Integer.parseInt(input.nextLine());
        
        if (line1 + line2 <= line3 || line2 + line3 <= line1 || line1 + line3 <= line2){
            System.out.println("not a triangle");
        } else if (line1 == line2 && line2 == line3){
            System.out.println("equilateral");
        } else if (line1 == line2 || line1 == line3 || line2 == line3){
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        } 

        input.close();
    }
}