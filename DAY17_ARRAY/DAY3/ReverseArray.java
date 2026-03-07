//package DAY17_ARRAY.DAY3;

public class ReverseArray {
 
  public static void main(String[] args) {
    int[] arr = {4,3,69,2,3,58,8};
    int left = 0;
    int right = arr.length-1;

    while (left<right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
      
    }
    for(int ele:arr){
      System.out.print(ele+" ");
    }

  }
}
