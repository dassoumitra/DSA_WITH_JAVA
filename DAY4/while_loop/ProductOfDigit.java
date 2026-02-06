// 10. Find and print the product of all digits of a given number.
//11. Count and print the total number of digits in a given number.

import java.util.Scanner;

public class ProductOfDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter number: ");
    num = sc.nextInt();
    int count=0;
    int rem;
    int product =1;
    System.out.print("Product Of all digits: ");
    while (num>0) {
      rem = num%10;
      num/=10;
      product *= rem;
      count++;
    }
    System.out.println(product);
    System.out.print("Total no digit: "+count);
    sc.close();

  }
}
