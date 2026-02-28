//Second large element

public class SecondLarge {
  public static void main(String[] args) {
    //int[] arr = {4, 10, 7, 6, 9, 3, 5,10,10};
    int[] arr = {10, 10, 10};
    //large element
    int max = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      if(arr[i] > max ){
        max  = arr[i];
      }
    }

    //second large element
    int secondLarge = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      if(arr[i] > secondLarge && arr[i]!=max){
        secondLarge = arr[i];
      }
    }
    if(secondLarge == Integer.MIN_VALUE){
      System.out.print("No second largest element. ");
    }
    else{
      System.out.print("Second large element: "+secondLarge);
    }
    
  }
}
