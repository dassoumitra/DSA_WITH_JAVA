package DAY8.mathematicalProblem;
// This program is asking you to calculate and print the sum of the series 1 + 1/2 + 1/3 + ... + 1/n.
// You need to write the code inside the `main` method to perform this calculation and print the
// result.
// 10. Calculate and print the value of the series
// 1 + 1/2 + 1/3 + … + 1/n.

import java.util.Scanner;

public class SumPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter last term: ");
    n = sc.nextInt();
    double sum = 0.0;
    for(int i=1; i<=n; i++){
      sum = sum+1/i;
      System.out.print("1/"+i);
      if(i<n)
        System.out.print(" + ");
    }
    System.out.println();
    System.out.println(sum);
    sc.close();
  }
}
