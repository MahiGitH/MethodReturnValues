import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        divide(num1, num2);
        scanner.close();
    }

    public static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("You can't divide a number by 0!");
            return;
        }
        System.out.println(num1 + " / " + num2 + " = " + (num1 * 1.0 / num2));
    }
}
