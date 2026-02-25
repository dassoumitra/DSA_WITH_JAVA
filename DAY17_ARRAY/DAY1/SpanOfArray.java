import java.util.Scanner;

public class SpanOfArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int size = sc.nextInt();

    int[] arr = new int[size];
    System.out.print("Enter element one by one: ");
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for(int i=0; i<arr.length; i++){
      if(max<arr[i]){
        max = arr[i];
      }
      if(min>arr[i]){
        min = arr[i];
      }
    }

    int span = max - min;
    System.out.print("Span of array: "+span);
  }
}
