// 16. Check whether the given number is a Perfect number.

import java.util.Scanner;

public class PerfectNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
    int sum=0;
    int i=1;
    int ori = num;
    while(i<num){
      if(num%i==0)
        sum+=i;
      i++;
    }
    if(ori==sum)
      System.out.println(ori+" is perfect number.");
    else
      System.out.println(ori+" is not perfect number.");


    sc.close();
  }
}
