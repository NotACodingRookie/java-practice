package Unit_02.Chapter_02.Q_02_02_01;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());
        
        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Fizz Buzz");
        } else if (num % 3 == 0 && num % 5 != 0){
            System.out.println("Fizz");
        } else if (num % 3 != 0 && num % 5 == 0){
            System.out.println("Buzz");
        } else if (num % 3 != 0 && num % 5 != 0){
            System.out.println(num);
        }

        input.close();
    }
}
