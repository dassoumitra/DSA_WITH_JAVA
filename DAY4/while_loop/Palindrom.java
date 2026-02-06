// 13. Check whether the given number is a palindrome.

import java.util.Scanner;

public class Palindrom {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    num = sc.nextInt();
    int ori = num;
    int reverse =0;
    int rem;
    while (num>0) {
      rem = num%10;
      reverse = reverse*10+rem;
      num/=10;
    }
    if(ori==reverse){
      System.out.println(ori+" is palindrome number.");
    }
    else
      System.out.println(ori+" is not palindrome number.");
    sc.close();
    
  }
  
}
