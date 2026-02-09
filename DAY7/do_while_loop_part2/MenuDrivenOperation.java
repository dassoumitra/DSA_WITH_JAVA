//12. Create a menu-driven program that allows the user to choose and perform different
// operations

import java.util.Scanner;

public class MenuDrivenOperation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st operand: ");
    int num1 = sc.nextInt();
    System.out.print("Enter 2nd operand: ");
    int num2 = sc.nextInt();
    do{
        System.out.print("Enter your operation,(+,-,*,/,%): and for stop the code , enter 'c': ");
        char ch = sc.next().charAt(0);
        if(ch=='+'){
          System.out.println("a+b : "+(num1+num2));
        }
        else if(ch=='-')
          System.out.println("a-b : "+(num1-num2));
        else if(ch=='*')
          System.out.println("a*b : "+(num1*num2));
        else if(ch=='/')
          System.out.println("a/b : "+(num1/num2));
        else if(ch=='%')
          System.out.println("a%b : "+(num1%num2));
        else if(ch=='c')
          break;
        else
          System.out.println("Enter valid operator.");

    }while(true);

   // sc.close();
  }
}
