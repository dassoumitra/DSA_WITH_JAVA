// 2. Find and print the sum of the first n even numbers.

import java.util.Scanner;

public class SumOfEvenNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter number: ");
    num = sc.nextInt();
    int sum = 0;
    System.out.print("Even number: ");
    for(int i=2; i<=num; i+=2){
      sum+=i;
      System.out.print(i+" ");
    }
    System.out.println();
    System.out.println("Sum of first "+num+" even number = "+sum);
    sc.close();
  }
}
