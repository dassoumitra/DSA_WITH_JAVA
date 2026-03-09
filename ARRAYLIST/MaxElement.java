import java.util.ArrayList;

public class MaxElement {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(10);
    nums.add(220);
    nums.add(30);
    nums.add(34);
    System.out.println(nums);
    
    if(nums.isEmpty()){
      System.out.println("list is empty");
      return;
    }
    int max = nums.get(0);
    for(int num : nums){
      if(max<num){
        max=num;
      }
    }
    System.out.println("Max element is : "+max);
  }
}
