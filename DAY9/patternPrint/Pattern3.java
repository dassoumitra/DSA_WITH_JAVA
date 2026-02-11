// 5. Print an Increasing Triangle of Stars
// *
// **
// ***
// ****

import java.util.Scanner;

public class Pattern3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row number: ");
    int r = sc.nextInt();
    for(int i=1;i<=r;i++){
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();

    }
    sc.close();
  }
}
