// 8. Calculate the sum of all odd numbers from 1 up to n.

import java.util.Scanner;

public class SumOfOddNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter number :");
    num = sc.nextInt();
    int i=1;
    int sum =0;
    while (i<=num) {
      if(i%2 !=0)
        sum+=i;
      i++;
    }
    System.out.println("Sum of all odd number: "+sum);
    sc.close();
  }
}
