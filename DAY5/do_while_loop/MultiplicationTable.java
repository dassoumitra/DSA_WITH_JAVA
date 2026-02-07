// 2. Print the multiplication table of a given number.

import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    num = sc.nextInt();
    int i=1;
    System.out.println("Multiplication of "+num);
    do{
      System.out.println(num+" * "+i+" : "+(num*i));
      i++;
    }while(i<=10);
    sc.close();
  }
}
