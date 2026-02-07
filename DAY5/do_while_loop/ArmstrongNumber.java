// 8. Check whether the given number is an Armstrong number.

import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    int ori = num;
    int count = 0;
    int temp = num;
    //count digit
    do{
      num/=10;
      count++;
    }while(num!=0);
    
    int sum = 0;
    do{
      int rem = ori%10;
      sum = (int)(sum + Math.pow(rem,count));
      ori/=10;
    }while(ori!=0);

    if(temp==sum){
      System.out.println("Number is palindrome.");
    }
    else
      System.out.println("Number is not palindrome.");
  }
}
