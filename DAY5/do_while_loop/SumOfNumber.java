// 3. Keep taking numbers from the user until 0 is entered, then print the sum of all
// entered numbers.

import java.util.Scanner;

public class SumOfNumber {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    int sum =0;
    do{
      System.out.print("Enter number : ");
      num = sc.nextInt();
      sum+=num;
      if(num==0)
        break;
    }while(true);
    System.out.println("Sum of all entered number: "+sum);
    sc.close();
  }
}
