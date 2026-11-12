package Unit_02.Chapter_02.Q_02_02_02;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        String input = scannerObj.nextLine();

        if (input.equals("Argentina")){
            System.out.println("Lionel Messi");
        } else if (input.equals("Portugal")){
            System.out.println("Cristiano Ronaldo");
        } else {
            System.out.println("no preference");
        } 


        scannerObj.close();
    }
}
