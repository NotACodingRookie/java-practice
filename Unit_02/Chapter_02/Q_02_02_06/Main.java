package Unit_02.Chapter_02.Q_02_02_06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long salary = Long.parseLong(input.nextLine());
        if (salary <= 58523) {
            System.out.println("1");
        } else if (salary <= 117045) {
            System.out.println("2");
        } else if (salary <= 181440) {
            System.out.println("3");
        } else if (salary <= 258482) {
            System.out.println("4");
        } else if (salary > 258482) {
            System.out.println("5");
        }

        input.close();
    }
}