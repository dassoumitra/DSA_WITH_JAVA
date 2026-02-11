//13. Calculate and print the value of the series
// 1 + x + x² + x³ + … + xⁿ.

import java.util.Scanner;

public class SumPattern4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter last term: ");
    int n = sc.nextInt();

    System.out.print("Enter the value of 'x': ");
    int x = sc.nextInt();

    double sum = 0;
    double power = 1;
    for(int i=0; i<=n; i++){
      sum+=power;
      System.out.print(x+"^"+i);
      if(i<n)
        System.out.print(" + ");
      power*=x;
    }
    System.out.println();
    System.out.println("Sum= "+sum);
    sc.close();

  }
}
