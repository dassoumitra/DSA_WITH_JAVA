import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class SumOfEvenDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    int sum = 0;
    while(n!=0){
      int rem = n%10;
      if(rem%2==0){
        sum+=rem;
      }
      n/=10;
    }
    System.out.println("Sum of even digit: "+sum);
    sc.close();
  }
}
