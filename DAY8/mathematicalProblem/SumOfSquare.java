package DAY8.mathematicalProblem;
// 8. Calculate and print the value of the series
// 1² + 2² + 3² + … + n²

import java.util.Scanner;

public class SumOfSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Enter last term: ");
    n = sc.nextInt();
    double sum=0;
    sum = (n*(n+1)*(2*n+1))/6;
    System.out.println(sum);
    sc.close();
  }
}
