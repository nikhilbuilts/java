
import java.util.Scanner;

public class qPassOrFail{
  public static void main(String[] args) {
      int marks;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your marks:");
      marks = sc.nextInt();

      String result = (marks>=33)?"Pass":"Fail";
      System.out.println(result);
  }
}