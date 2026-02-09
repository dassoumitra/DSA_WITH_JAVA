// 8. Print all prime numbers between 1 and 100.
// 9. Check whether the given number is a prime number.

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();

    boolean isprime = true;
    for(int i=2; i*i<=num; i++){
      if(num%i==0)
        isprime = false;
    }
    if(isprime)
      System.out.println(num+" is prime.");
    else
      System.out.println(num+" is not prime.");


    for(int j=2;j<=num;j++){
      boolean isPrime = true;
      for(int k = 2; k*k<=j; k++){
        if(j%k==0){
          isPrime = false;
          break;
        }
        
      }
      if(isPrime){
        System.out.print(j+" ");
      }

    }
    sc.close();
  }
}
