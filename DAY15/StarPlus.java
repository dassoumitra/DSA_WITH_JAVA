//    *
//    *
//  *****
//    *
//    * 

import java.util.Scanner;

public class StarPlus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int r = sc.nextInt();
    int mid = Math.ceilDiv(r,2);
    //System.out.println(mid);
  

    for(int i=1; i<=r; i++){
      
      for(int j=1; j<=r; j++){
        if(mid==i || mid==j)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
