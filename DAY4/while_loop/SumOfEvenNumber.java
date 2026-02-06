// 7. Calculate the sum of all even numbers from 1 up to n.
import java.util.Scanner;

public class SumOfEvenNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter your number: ");
    num = sc.nextInt();
    int sum =0;
    int i=1;
    while (i<=num) {
      if(i%2==0)
        sum+=i;
      i++;
    }
    System.out.println("Sum of all even number: "+sum);

  sc.close();
  }
}
