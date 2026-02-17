//     1
//    12
//   123
//  1234   

import java.util.Scanner;

public class NumberTriangleReverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row number : ");
    int r = sc.nextInt();

    for(int i=1; i<=r; i++){
      for(int j=1; j<=r-i; j++){//spaces
        System.out.print(" ");
      }

      for(int j=1; j<=i; j++){// star
        System.out.print(j);
      }
      System.out.println();
    }
    sc.close();
  }
}
