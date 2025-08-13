
  import java.util.*;

  public class tax_calculator{
    public static void main(String[] args) {
        int tax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        int income = sc.nextInt();

        if(income <= 500000){
          tax = 0;
        }
        else if(income>500000 && income<1000000){
          tax = (int) (income * 0.2);
        }
        else if(income>=1000000){
          tax = (int) (income * 0.3);
        }

        System.out.println(tax);
    }
  }