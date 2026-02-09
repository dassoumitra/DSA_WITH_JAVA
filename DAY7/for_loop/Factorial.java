// 7. Calculate and print the factorial of every number from 1 to n.

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    int fact = 1;
    for(int i=1; i<=num; i++){
      fact*=i;
      System.out.println("Factorial of : "+i+" = "+fact);

    }

    sc.close();
  }
}
