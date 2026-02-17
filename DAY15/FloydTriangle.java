// 1
// 2 3
// 4 5 6
// 7 8 9 10

import java.util.Scanner;

public class FloydTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int r = sc.nextInt();
    int a = 1;

    for(int i=1; i<=r; i++){
      
      for(int j=1; j<=i; j++){
        System.out.print(a+"  ");
        a++;
      }
      System.out.println();
    }
    sc.close();
  }
}
