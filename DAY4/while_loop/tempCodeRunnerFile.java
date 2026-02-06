// 19. Print the Fibonacci series up to n terms.

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter number: ");
    num= sc.nextInt();
    int i=0;
    int a=0;
    int b=1;
    int c=0;
    if(a==0 || b==1)
      System.out.print(a+" "+b+" ");
    while (i<num-2) {
      c=a+b;
      a=b;
      b=c;
      i++;
      System.out.print(c+" ");
    }
    sc.close();
  }
}
