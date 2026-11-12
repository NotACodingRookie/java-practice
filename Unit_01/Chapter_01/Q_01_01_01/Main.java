package Unit_01.Chapter_01.Q_01_01_01;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // comment test
        
        Scanner scannerObj = new Scanner(System.in);

        String studentName = scannerObj.nextLine();

        System.out.println("Good evening, " + studentName + "!");
        scannerObj.close();
    }
}
