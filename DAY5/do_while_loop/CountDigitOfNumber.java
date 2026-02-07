// 5. Count and print the number of digits in the given number.

import java.util.Scanner;

public class CountDigitOfNumber {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    num = sc.nextInt();
    int count=0;
    System.out.print("Total of digit in given number "+num+" : ");
    do{
      num/=10;
      count++;
    }while(num!=0);
    System.out.print(count);

    sc.close();
  }
}
