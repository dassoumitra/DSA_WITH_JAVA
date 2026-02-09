// 10. Print the Fibonacci series up to the required number of terms.

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    System.out.println("Fibonacci series upto "+num+" th term : ");
    if(num<=0)
      System.out.println("No fibonacci series.");
    else if(num==1)
      System.out.println("0");
    else{
      int a=0, b=1;
      System.out.print(a+" "+b);
      for(int i=3;i<=num;i++){
        int c = a+b;
        System.out.print(" "+c);
        a=b;
        b=c;
      }
    }
    sc.close();
  }
  
}
