
import java.util.Scanner;

public class Pyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row number: ");
    int r = sc.nextInt();

    int nsp = r-1;
    int nst = 1;
    for(int i = 1; i<=r; i++){
      for(int j=1; j<=nsp; j++){//spaces
        System.out.print(" ");
      }
      for(int j=1; j<=nst; j++){//star
        System.out.print("*");
      }
      nsp-=1;
      nst+=2;
      System.out.println();
    }


    int nspO = 1;
    int nstO = 2*r-3;

    for(int i=1; i<=r-1; i++){
      for(int j=1; j<=nspO; j++){
        System.out.print(" ");
      }

      for(int j=1; j<=nstO; j++){
        System.out.print("*");
      }
      nspO+=1;
      nstO-=2;
      System.out.println();
    }
    sc.close();
  }
}
