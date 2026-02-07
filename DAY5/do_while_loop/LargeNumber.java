// 4. Keep taking numbers from the user until 0 is entered, then print the largest number
// among all inputs.

import java.util.Scanner;

public class LargeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int large = Integer.MIN_VALUE;
    do{
      System.out.print("Enter number: ");
      num  = sc.nextInt();
      if(large<num)
        large  = num;
      if(num==0)
        break;
    }while(true);
    System.out.println("Large number among entered number: "+large);
    sc.close();
  }
}
