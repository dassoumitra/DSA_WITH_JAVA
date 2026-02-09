//11. Find the HCF (Highest Common Factor) of the given numbers.

import java.util.Scanner;

public class HCF {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number : ");
    int num1 = sc.nextInt();
    System.out.print("Enter 2nd number : ");
    int num2  = sc.nextInt();
    int a=num1;
    int b = num2;
    do{
      int rem = num1%num2;
      num1=num2;
      num2=rem;
    }while(num2!=0);
    System.out.println("HCF: "+num1);
    System.out.println("LCM: "+((a*b)/num1));
  }
}
