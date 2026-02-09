/*5. Print the multiplication table of a given number.
6. Calculate and print the factorial of a given number.*/

import java.util.Scanner;

class MultiplicationTableAndFactorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    System.out.println("Multiplication table of "+num+" : ");
    int fact = 1;
    for(int i=1; i<=10; i++){
      System.out.println(num+" * "+i+" : "+(num*i));
    }


    
    for(int j=1; j<=num; j++){
      fact*=j;
    }
    System.out.print("Factorial of "+num+" : "+fact);


    sc.close();
  }

  
}