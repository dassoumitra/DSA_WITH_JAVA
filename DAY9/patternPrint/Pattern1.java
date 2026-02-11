//1. Print a Single Star (*)
//2. Print Four Stars (****)
//3. Print n Stars on Same Line

import java.util.Scanner;

public class Pattern1 {
  public static void main(String[] args) {
    System.out.println("*");
    System.out.println("****");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of 'n' : ");
    int n = sc.nextInt();
    for(int i=1;i<=n;i++)
      System.out.print("*");

    sc.close();

    
  }
}
