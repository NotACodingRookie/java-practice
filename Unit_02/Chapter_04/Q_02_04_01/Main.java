package Unit_02.Chapter_04.Q_02_04_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        while (!name.equals("A girl has no name")) {
            System.out.println("hello " + name + "!");
            System.out.println("NEXT!");
            name = input.nextLine();
        }
        System.out.println("*sweats profusely*");
        input.close();
    }
}