//PRODUCT OF ALL ELEMENT


import java.util.Scanner;

public class ProductOfElements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    int product=1;
    System.out.println("Enter element : ");
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
      product*=arr[i];
    }

    System.out.print("product of Element: "+product);


    sc.close();
  }
}
