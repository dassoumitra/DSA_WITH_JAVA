//     ****
//    **** 
//   ****
//  ****  



import java.util.Scanner;

public class Rhombus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row number : ");
    int r = sc.nextInt();
    
    //METHOD 1
    // for(int i=1; i<=r; i++){
    //   for(int j=1; j<=r-i; j++){//spaces
    //     System.out.print(" ");
    //   }

    //   for(int j=1; j<=r; j++){// star
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    //METHOD 2
    int nsp = r-1;
    int nst = r;
    for(int i=1; i<=r; i++){
      for(int j=1; j<=nsp; j++){
        System.out.print(" ");
      }

      for(int j=1; j<=nst; j++){
        System.out.print("*");
      }
      nsp--;
      //nst+=1;
      System.out.println();
    }
    sc.close();
  }
}
