// 15. Calculate and print the sum of even digits and the sum of odd digits of the given
// number separately

import java.util.Scanner;

public class SumOfEvenOddDigit {
  public static void main(String[] args) {
    int num;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    num = sc.nextInt();
    int Sumeven=0, Sumodd=0;
    do{
      int rem = num%10;
      if(rem%2==0)
        Sumeven+=rem;
      else
        Sumodd+=rem;
      num/=10;
    }while(num!=0);
    System.out.println("Total Even digit : "+Sumeven);
    System.out.println("Total Odd digit : "+Sumodd);

    sc.close();
  }
  
}
