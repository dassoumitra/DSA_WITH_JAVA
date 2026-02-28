//


import java.util.Scanner;

public class IndexMultiplication {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.print("Enter element: ");
    for(int i = 0; i < arr.length; i++){
      arr[i] = sc.nextInt();
    }

    for(int i = 0; i < arr.length; i++){
      if((i) % 2 != 0){
        arr[i] = arr[i] * 2;
      }
      else{
        arr[i] = arr[i] + 10;
      }

      System.out.print(arr[i]+" ");

    }

    sc.close();
    
  }
}
