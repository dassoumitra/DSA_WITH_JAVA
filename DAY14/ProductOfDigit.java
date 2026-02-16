import java.util.Scanner;

class ProductOfDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = sc.nextInt();

    int product = 1;

    if(n==0)
      System.out.println("Product of digits: "+n);

    else{
      while (n!=0) {
        int rem = n%10;
        product = product*rem;
        n/=10;
      }
      System.out.println("Product of Digits: "+product);
    }
    sc.close();
  } 
}