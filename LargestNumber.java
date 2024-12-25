
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        if(num1 == num2)
        {
            System.out.println(num1+ " is equal to " +num2);
        }
        else if(num1 > num2)
        {
            System.out.println(num1+ " is greater than " +num2);
        }
        else
        {
            System.out.println(num1+ " is smaller than " +num2);
        }
    }
}
