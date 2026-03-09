
import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
  public static void main(String[] args) {
    int[] nums = {1,3,4,1};
    // ArrayList<Integer> list = new ArrayList<>();
    // System.out.println(list);
    // list.add(4);
    // System.out.println(!list.contains(4));
    // for(int i=0; i<arr.length; i++){
    //   if(list.contains(arr[i])){
    //     list.add(arr[i]);
    //   }
    // }
    // System.out.println(list);


    List<Integer> ans = new ArrayList<>();

    for(int i = 0; i < nums.length; i++){
      int index = Math.abs(nums[i]) - 1;

        if(nums[index] > 0){
            nums[index] = -nums[index];
        }
    }

    for(int i=0; i<nums.length; i++){
      System.out.print(nums[i]+" ");
    }
  }
}
