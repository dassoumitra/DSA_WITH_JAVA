// 15. Check whether the given number is an Armstrong number.

import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter number: ");
    num = sc.nextInt();
    int count =0;
    int ori = num;
    int original = num;
    //count the digit of number
    while (num>0) {
      num/=10;
      count++;
    }
    //System.out.println(count);
    //compute the power and sum
    int sum=0;
    int rem;
    while (ori>0) {
      rem = ori%10;
      sum = (int) (sum + Math.pow(rem, count));
      ori/=10;
    }
    if(original == sum)
      System.out.println(original+" is Armstrong number");
    else
      System.out.println(original+" is not armstrong number.");
    sc.close();
  }
}
