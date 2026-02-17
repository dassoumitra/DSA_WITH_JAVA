//     *
//    ** 
//   *** 
//  **** 

import java.util.Scanner;

public class StarTriangleReverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row number: ");
    int r = sc.nextInt();

    // for(int i=1; i<=r; i++){
    //   for(int j=1; j<=r; j++){
    //     if((i+j)>r){
    //       System.out.print("*");
    //     }
    //     else
    //       System.out.print(" ");
    //   }
    //   System.out.println();
    // }


    for(int i=1; i<=r; i++){
      for(int j=1; j<=r-i; j++){
        System.out.print(" ");
      }

      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}
