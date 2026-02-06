//5. Print the multiplication table of a given number from n × 1 to n × 10.

import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter your number : ");
  
    num = sc.nextInt();
    System.out.println("Multiplication table of "+num+" :" );
    int i=1;
    while (i<=10) {
      System.out.println(num+" * "+i+": "+(num*i));
      i++;
      
    }
  }
}
