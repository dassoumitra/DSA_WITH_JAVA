// 12. Reverse the given number and print the reversed value.

import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter number : ");
    num =sc.nextInt();
    int reverse=0;
    int rem;
    System.out.print("Reverse of given number: ");
    while (num>0) {
      rem = num%10;
      reverse = reverse*10+rem;
      num/=10;
    }
    System.out.println(reverse);
    sc.close();
  }
}
