
import java.util.Scanner;

public class switch_statement{
  public static void main(String[] args) {
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    number = sc.nextInt();

    switch(number){
      case 1:System.out.println("1");
      break;
      case 2:System.out.println("2");
      break;
      case 3:System.out.println("3");
      break;
    }
  }
}