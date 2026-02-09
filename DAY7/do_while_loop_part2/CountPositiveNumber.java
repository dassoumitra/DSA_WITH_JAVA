//13. Keep taking numbers from the user until a negative number is entered, then count
// how many positive numbers were entered

import java.util.Scanner;

public class CountPositiveNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int count=0;
    do{
      System.out.print("Enter number: ");
      num = sc.nextInt();
      if(num>=0)
        count++;
      
    }while(num>=0);
    
    System.out.println("Total positive number: "+count);


    sc.close();


  }
}
