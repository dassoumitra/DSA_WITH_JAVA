// 1. Find and print the sum of the first n natural numbers.

import java.util.Scanner;

public class SumOfNatural {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter number :");
    num = sc.nextInt();
    double sum = (double)(num+1)/2;
    sum *= num; 

    // for(int i=1; i<=num; i++){
    //   sum+=i;
    // }
    System.out.println("Sum of first "+num+" natural number = "+sum);
    sc.close();
  }
}
