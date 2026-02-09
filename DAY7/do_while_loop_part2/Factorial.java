//9. Calculate and print the factorial of the given number.

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    num = sc.nextInt();
    if(num==0)
      System.out.println("Factorial of "+num+" = "+0);
    else{
          int fact = 1;
          int i =1;
          do{
            fact*=i;
            i++;  
          }while(i<=num);
          System.out.println("Factorial of "+num+" = "+fact);

    }
      

    sc.close();
  }

  
}