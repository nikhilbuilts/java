import java.util.*;

public class productUsingScanner{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first no: ");
    int a = sc.nextInt();
    System.out.print("Enter the second no: ");
    int b = sc.nextInt();

    int mul = a*b;
    
    System.out.print(mul);


  }
}