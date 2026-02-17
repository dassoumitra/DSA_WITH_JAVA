// *****
//  ****
//   ***
//    **
//     *
import java.util.Scanner;

public class ReverseTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row number: ");
    int r = sc.nextInt();

    int nsp = 0;
    int nst = r;
    for(int i=1; i<=r; i++){
      for(int j=1; j<=nsp; j++){
        System.out.print(" ");
      }

      for(int j=1; j<=nst; j++){
        System.out.print("*");
      }
      nsp+=1;
      nst-=1;
      System.out.println();
    }
    sc.close();
  }
}
