//SUM OF ALL ELEMENT

import java.util.Scanner;

public class SumOfElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    int sum=0;
    System.out.println("Enter element : ");
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
      sum+=arr[i];
    }

    System.out.print("Sum of Element: "+sum);


    sc.close();

    
  }
}
