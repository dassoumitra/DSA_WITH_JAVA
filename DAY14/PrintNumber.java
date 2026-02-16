// 1234
// 1234
// 1234
// 1234

import java.util.Scanner;

public class PrintNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows & columns: ");
    int r = sc.nextInt();
    int c = sc.nextInt();

    for(int i=1; i<=r; i++){
      for(int j=1; j<=c; j++){
        System.out.print(j);
      }
      System.out.println();
    }

    sc.close();
  
  }
}
