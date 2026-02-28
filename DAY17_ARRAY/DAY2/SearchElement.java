import java.util.Scanner;

public class SearchElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {7,3,6,8,69,2,3,4};
    print(arr);
    System.out.print("\nEnter Search element: ");
    int target = sc.nextInt();
    int found  = -1;

    for(int i=0; i<arr.length; i++){
      if(arr[i] == target){
        found = i;
        break;
      }
    }

    if(found==-1){
      System.out.print("Element is not found. ");
    }
    else{
      System.out.print("Element is found at index : "+found);
    }
    sc.close();
  }





  public static void print(int[] arr){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }


}
