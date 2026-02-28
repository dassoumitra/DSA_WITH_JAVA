public class TwoSum {
  public static void main(String[] args) {
    int[] arr = {3,9,5,3,1,6};
    int target = 10;
    int[] targetArr = new int[2];

    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[i]+arr[j] == target){
          targetArr[0] = i;
          targetArr[1] = j;
        }
      }
    }

    //index of two sum
    for(int i=0; i<targetArr.length; i++){
      System.out.print(targetArr[i]+" ");
    }
  }
}
