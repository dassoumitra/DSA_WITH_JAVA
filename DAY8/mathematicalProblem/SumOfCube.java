package DAY8.mathematicalProblem;
// 9. Calculate and print the value of the series
// 1³ + 2³ + 3³ + … + n³.

import java.util.Scanner;

public class SumOfCube {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Enter last term: ");
    n = sc.nextInt();

    double sum = (n*(n+1))/2;
    sum = sum*sum;

    System.out.println(sum);
    sc.close();
  }
}
