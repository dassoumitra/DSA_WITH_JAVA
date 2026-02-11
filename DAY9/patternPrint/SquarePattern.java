// 4. Print Square of Stars (n x n Stars)

import java.util.Scanner;

import org.xml.sax.SAXException;

public class SquarePattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of 'n': ");
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
