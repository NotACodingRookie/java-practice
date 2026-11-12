package Unit_02.Chapter_02.Q_02_02_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int health = Integer.parseInt(input.nextLine());
        
        if (health <= 300 && health >= 80){
            System.out.println("healthy");
        } else if (health <= 79 && health >= 60){
            System.out.println("bloody nose");
        } else if (health <= 59 && health >= 40){
            System.out.println("face swollen");
        } else if (health <= 39 && health >= 20){
            System.out.println("eyes bloodshot, face bleeding");
        } else if (health <= 19 && health >= 1){
            System.out.println("even more blood");
        } else if (health == 0){
            System.out.println("eyes closed. Game Over");
        } 
        input.close();
    }
}