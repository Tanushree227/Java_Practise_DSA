
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            if(age > 18)
            {
                System.out.println("You are an adult. And, you are eligible to vote");
            }
            else
            {
                System.out.println("You are not an adult. You are not eligible to vote");
            }
        }
    }
}
