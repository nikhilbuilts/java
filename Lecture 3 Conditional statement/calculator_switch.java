
import java.util.Scanner;

public class calculator_switch{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first no: ");
      int a = sc.nextInt();
      System.out.println("Enter second no: ");
      int b = sc.nextInt();
      System.out.println("Select one +, -, *, /, %");

      char operator = sc.next().charAt(0);

      switch (operator) {
          case '+':System.out.println("The sum of " + a + " and " + b + " is " + (a+b));
              break;
          case '-':System.out.println("The subtract of " + a + " and " + b + " is " + (a-b));
              break;
          case '*':System.out.println("The multiplication of " + a + " and " + b + " is " + (a*b));
              break;
          case '/':System.out.println("The divide of " + a + " and " + b + " is " + (a/b));
              break;
          case '%':System.out.println("The modulus of " + a + " and " + b + " is " + (a%b));
              break;
      }
  }
}