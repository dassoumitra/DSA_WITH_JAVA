//find maximum and minimum element
import java.util.Scanner;

public class MaximumElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    int sum=0;
    System.out.println("Enter element : ");
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;
    int mini = Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
      if(max<arr[i]){//maximum
        max = arr[i];
      }
      if(mini>arr[i]){//minimum
        mini = arr[i];
      }
    }

    System.out.println("Maximum Element: "+max);
    System.out.println("Minimum Element: "+mini);



    sc.close();
  }
}
