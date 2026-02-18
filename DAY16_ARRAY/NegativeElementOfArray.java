//PRINT NEGATIVE NUMBER

class NegativeElementOfArray{
  public static void main(String[] args) {
    int[] arr = {1,52,3,-9,5,-4,-2};


    System.out.println("Negative Element of Array:");
    for(int i=0; i<arr.length; i++){
      if(arr[i]<0){
        System.out.print(arr[i]+" ");
      }
    }
  }
}