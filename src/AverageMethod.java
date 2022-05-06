import java.util.Scanner;

public class AverageMethod {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    double num1 = scan.nextDouble();
    System.out.println("Enter the second number: ");
    double num2 = scan.nextDouble();
    System.out.println("Enter the third number: ");
    double num3 = scan.nextDouble();
    System.out.println("Average:" + average(sum(num1, num2, num3)));

    scan.close();
  }

  public static double sum(double num1, double num2, double num3) {
    return (num1 + num2 + num3);
  }

  public static double average(double sum) {
    return (sum / 3);

  }
}
