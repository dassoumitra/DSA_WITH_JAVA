import java.util.Scanner;

public class FindIndexOfElement {
  public static void main(String[] args) {
    Scanner sc  =new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter element of array: ");
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter searched element: ");
    int ele = sc.nextInt();
    
    int idx = -1;
    for(int i=0; i<arr.length; i++){
      if(arr[i]==ele){
        idx = i;
        break;
      }
    }
    System.out.print("Index: "+idx);

    sc.close();
  }
}
