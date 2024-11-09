
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int r = scanner.nextInt();
            double area = 3.14 * r * r;
            System.out.println("The area of the circle is " + area);
        }
    }
}
