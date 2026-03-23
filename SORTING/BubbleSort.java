public class BubbleSort{
  public static void main(String[] args) {
    int[] arr = {4,6,3,4,6,2};
    int n = arr.length;
    for(int i = 0; i < n-1; i++){
      int max = Integer.MIN_VALUE;
      int maxIdx = -1;
      for(int j = i; j < n; j++){
        if(max < arr[j]){
          max = arr[j];
          maxIdx = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[maxIdx];
      arr[maxIdx] = temp;
    }
    printf(arr);
  }

  public static void printf(int[] arr){
    for(int ele : arr) System.out.print(ele+" ");

  }
}