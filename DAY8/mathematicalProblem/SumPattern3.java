//12. Calculate and print the value of the series
// 1! + 2! + 3! + … + n!.

import java.util.Scanner;

public class SumPattern3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter last term: ");
    int n = sc.nextInt();
    if(n<=0){
      System.out.println("Enter positive integer.");
      return;
    }
    long fact = 1L;
    long sum = 0L;

    for(int i = 1; i<=n; i++){
      System.out.print(i+"!");
      fact*=i;
      sum+=fact;

      if(i<n)
        System.out.print(" + ");

    }
    System.out.println();
    System.out.println("Sum = "+sum);

    sc.close();
  }
}