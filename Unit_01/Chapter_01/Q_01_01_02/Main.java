package Unit_01.Chapter_01.Q_01_01_02;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        double height = scannerObj.nextDouble();
        double width = scannerObj.nextDouble();

        System.out.println(height * width);
        scannerObj.close();
    }
}
