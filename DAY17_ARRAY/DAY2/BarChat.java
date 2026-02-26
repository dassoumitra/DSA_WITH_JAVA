
import java.util.Scanner;

public class BarChat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }

    //print bar chat
    int nsp = arr.length - 1;
    int nst = 1;
    int max = Integer.MIN_VALUE;

    for(int i=0; i<arr.length; i++){
      if(arr[i]>max){
        max = arr[i];
      }  
    }

    for(int i=max; i>=1; i--){
      for(int j=0; j<arr.length; j++){
        if(arr[j]>=i){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }

  sc.close();
  }
}
