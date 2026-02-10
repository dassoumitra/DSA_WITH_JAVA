// 3. Find and print the sum of the first n odd numbers.

import java.util.Scanner;

public class SumOfOddNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter number: ");
    num = sc.nextInt();
    int sum = 0;
    for(int i=1; i<=num; i+=2){
      sum+=i;
    }
    System.out.println(sum);
    sc.close();
  }
}
