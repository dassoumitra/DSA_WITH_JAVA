//10. Print the Fibonacci series up to the required number of terms

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    System.out.println("Fibonacci Series: ");
    if(num<=0)
      System.out.print("No Fibonacci series.");
    
    else if(num==1)
      System.out.print("0");
    else{
      int a=0, b=1;
      System.out.print(a+" "+b);
      int i = 3;
      do{
        if(num==2)
          break;
        int c = a+b;
        System.out.print(" "+c);
        a=b;
        b=c;
        i++;
      }while(i<=num);

    }



    sc.close();
  }
}
