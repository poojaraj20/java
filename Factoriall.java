import java.util.Scanner;

public class Factoriall {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    int factorial = fact(n);
    System.out.println("The factorial of " + n + " is: " + factorial);
  }

  public static int fact(int n) {
    if (n == 0) {
      return 1;
    }
    return n *fact(n - 1);

  }
}
