// 9. Calculate and print the factorial of a given number.

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter number :");
    num = sc.nextInt();
    int i=1;
    int fact =1;
    while (i<=num) {
      fact*=i;
      i++;
    }
    System.out.println("Factorial of "+num+" is :"+fact);
    sc.close();
  }
}
