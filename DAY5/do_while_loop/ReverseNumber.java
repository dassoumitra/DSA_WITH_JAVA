// 6. Reverse the given number and print the reversed value.
// 7. Check whether the given number is a palindrome.

import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int ori = num;
    int reverse = 0;
    do{
      int rem = num%10;
      reverse = reverse*10+rem;
      num/=10;
    }while(num!=0);
    System.out.println("Reverse number: "+reverse);
    if(ori==reverse)
      System.out.println("Entered number is palindrome.");
    else
      System.out.println("Enter number is not palindrome.");
    sc.close();
  }
}
