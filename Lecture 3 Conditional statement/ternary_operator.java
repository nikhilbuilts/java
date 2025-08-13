
import java.util.Scanner;

public class ternary_operator{
  public static void main(String[] args) {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    a = sc.nextInt();
    
    String type = ((a%2) == 0)?"Even":"Odd";
    System.out.println(type);


  }
}