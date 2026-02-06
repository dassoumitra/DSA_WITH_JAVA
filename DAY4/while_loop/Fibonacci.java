// 19. Print the Fibonacci series up to n terms.
// Find and print the sum of the Fibonacci series up to n terms.
import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter number: ");
    num= sc.nextInt();
    if(num<=0)
      System.out.println("no fibonacci series");
    else if(num==1)
      System.out.println("0");
    else{
      int a=0, b=1;
      int sum= a+b;
      System.out.print(a+" "+b+" ");
      int i=3;
      while (i<=num) {
        int c = a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
        i++;
        sum+=c;   
      }
      System.out.println();
      System.out.println("Sum of Fibonacci series: "+sum);
    }
    sc.close();
  }
}
