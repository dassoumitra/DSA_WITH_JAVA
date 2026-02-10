// 11. Print the series of powers of two:
// 1 + 2 + 4 + 8 + … + 2ⁿ.

import java.util.Scanner;

public class SumPattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter last term: ");
    int n =sc.nextInt();
    long sum =0;
    long term = 1;
    for(int i=0; i<=n; i++){
      System.out.print(term);
      sum+=term;

      if(i<n)
        System.out.print(" + ");

      term = term << 1;
    }
    System.out.println();
    System.out.println("Sum= "+sum);

    sc.close();
  }
}
