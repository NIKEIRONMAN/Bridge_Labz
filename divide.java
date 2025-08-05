import java.util.*;

class divide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b != 0) {
            int result = a / b;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
