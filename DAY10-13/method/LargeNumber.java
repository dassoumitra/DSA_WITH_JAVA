import java.util.Scanner;

public class LargeNumber{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a, b, c, d;
    System.out.print("Enter numbers noe by one: ");
    a=sc.nextDouble();
    b=sc.nextDouble();
    c=sc.nextDouble();
    d=sc.nextDouble();

    System.out.println("Large number : "+Math.max(a,Math.max(b,Math.max(c,d))));
    System.out.println("Minimum number : "+Math.min(a,Math.min(b,Math.min(c,d))));
    sc.close();
  }
}