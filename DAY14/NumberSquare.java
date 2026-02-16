// 1111
// 2222
// 3333
// 4444

import java.util.Scanner;

public class NumberSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows & columns: ");
    int r = sc.nextInt();
    int c = r;

    for(int i=1; i<=r; i++){
      for(int j=1; j<=c; j++){
        System.out.print(i+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
