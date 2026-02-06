// 18. Check whether the given number is a prime number.


import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter number : ");
    num = sc.nextInt();
    if (num<=1) {
      System.out.println(num+" is not prime number.");
      return;
    }
    boolean isPrime = true;
    for(int i=2; i*i<=num; i++){
      if(num%i==0){
        isPrime = false;
        break;
      }
    }
    if (isPrime) {
      System.out.println(num+" is prime number.");  
    }
    else
      System.out.println(num+" is not prime number.");

    sc.close();
  }
  
}
