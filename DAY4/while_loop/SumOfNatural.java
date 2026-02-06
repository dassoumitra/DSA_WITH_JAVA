//6. Calculate and print the sum of the first n natural numbers.

import java.util.Scanner;

public class SumOfNatural {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter your number: ");
    num = sc.nextInt();
    System.out.print("Sum of first "+num+" number : ");
    int i=1;
    int sum=0;
    while (i<=num) {
      sum+=i;
      i++;
    }
    System.out.print(sum);
    sc.close();
  }
}
