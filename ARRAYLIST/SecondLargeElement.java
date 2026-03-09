
import java.util.ArrayList;
import java.util.Collections;

public class SecondLargeElement {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(10);
    nums.add(220);
    nums.add(30);
    nums.add(34);
    nums.add(10);
    nums.add(100);
    
    if(nums.isEmpty()){
      System.out.println("list is empty");
      return;
    }
    System.out.println(nums);
    int max = Collections.max(nums);
    int secondMax = Integer.MIN_VALUE;
    
    for(int num : nums){
      if(num>secondMax && num!=max){
        secondMax = num;
      }
    }
    System.out.println("Second Large element: "+secondMax);
  }
}
