// ****
// ****
// ****
// ****

import java.util.Scanner;

public class PrintSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows and columns: ");
    int r = sc.nextInt();
    int c = r;
    
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    sc.close();
  }
}
