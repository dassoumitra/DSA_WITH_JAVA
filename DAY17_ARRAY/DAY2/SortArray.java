import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int size = sc.nextInt();

    int[] arr = new int[size];

    System.out.print("Enter element one by one: ");
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }

    //sort array
    Arrays.sort(arr);
    System.out.print("Sort array is : ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }

    sc.close();
  }
}
