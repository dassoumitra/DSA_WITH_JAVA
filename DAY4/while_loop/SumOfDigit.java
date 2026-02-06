// 14. Find and print the sum of digits of the given number.

import java.util.Scanner;

public class SumOfDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int sum=0;
    int rem;
    System.out.print("Enter number: ");
    num = sc.nextInt();
    while (num>0) {
      rem = num%10;
      sum+=rem;
      num/=10;
    }
    System.out.println("Sum of digits : "+sum);
    sc.close();
  }
}
