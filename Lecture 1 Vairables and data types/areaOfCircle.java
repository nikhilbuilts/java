import java.util.*;

public class areaOfCircle{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius of circle: ");
    float r = sc.nextInt();

    float area = 3.14f*r*r;
    
    System.out.print(area);


  }
}