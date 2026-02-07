// 22. Print the cube of each number from 1 to n.

import java.util.Scanner;

public class Cube {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter number: ");
    num = sc.nextInt();
    int i=1;
    System.out.println("Cube of each number from 1 to "+num+":");
    while (i<=num) {
      System.out.print(i*i*i+" ");
      i++;    
    }
    sc.close();
  }
}
