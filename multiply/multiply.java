
import java.util.Scanner;

public class multiply {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number you want");
            int num1 = sc.nextInt();
            System.out.println("enter the number you want");
            int num2 = sc.nextInt();
            int multiply = num1 * num2;
            System.out.println(multiply);
        };

    }
}
