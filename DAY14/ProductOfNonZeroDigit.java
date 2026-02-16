import java.util.Scanner;

public class ProductOfNonZeroDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();

    int product = 1;
    while(n!=0){
      int rem = n%10;
      if(rem!=0){
        product*=rem;
      }
      
      n/=10;
    }

    System.out.println("Product of non zero digit: "+product);
    sc.close();
  }
}