// 23. Print all numbers between a and b that are divisible by 7.

import java.util.Scanner;

public class DivisibleBy7 {
  public static void main(String[] args) {
    int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter starting number: ");
    a = sc.nextInt();
    //System.out.println();
    System.out.print("Enter ending number: ");
    b = sc.nextInt();
    System.out.println("All number between "+a+" and "+b+" that are divisible by 7 : ");
    while (a<=b) {
      if(a%7==0)
        System.out.print(a+" ");
      a++;
      
    }
    sc.close();
  }
}
