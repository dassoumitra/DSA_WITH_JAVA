// 28. Find the smallest digit in the given number.
// 29. Find the largest digit in the given number.

import java.util.Scanner;

public class LargeAndSmallDigit {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    num = sc.nextInt();

    int large = Integer.MIN_VALUE;
    int small = Integer.MAX_VALUE;
    //System.out.println(large+" and "+small);

    while (num!=0) {
      int rem = num%10;
      //large=rem;
      if(rem>large){
        large = rem;
      }

      if(small>rem)
        small = rem;
      num/=10;    
    }

    System.out.println("Large digit: "+large);
    System.out.println("Small digit : "+small);


    sc.close();

  }
}
