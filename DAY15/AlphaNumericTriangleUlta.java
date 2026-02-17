// AAAAA
// 2222
// CCC
// 44
// E

import java.util.Scanner;

public class AlphaNumericTriangleUlta {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int r = sc.nextInt();

    for(int i=1; i<=r; i++){
      for(int j=1; j<=r+1-i; j++){
        if(i%2==0){
          System.out.print(i+" ");
        }
        else{
          System.out.print((char)(64+i)+" ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
