// 26. Find the HCF (Highest Common Factor) of two given numbers.
// 27. Find the LCM (Least Common Multiple) of two given numbers.
import java.util.Scanner;

public class HCF {
  public static void main(String[] args) {
    int num1 , num2;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    num1 = sc.nextInt();
    System.out.print("Enter second number: ");
    num2 = sc.nextInt();
    int rem;
    System.out.print("HCF of "+num1+" and "+num2+" is : ");
    int a=num1;
    int b=num2;
    while (num2!=0) {
      rem = num1 % num2;
      num1 = num2;
      num2 = rem;
    }
    int hcf = num1;
    System.out.println(hcf);
    int lcm = (a*b)/hcf;
    System.out.print("LCM of "+a+" and "+b+" is: ");
    System.out.println(lcm);
    sc.close();
  }
}
