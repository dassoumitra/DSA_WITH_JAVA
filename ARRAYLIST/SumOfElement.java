import java.util.ArrayList;

public class SumOfElement {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(5);
    nums.add(10);
    nums.add(12);
    nums.add(78);
    System.out.println(nums);

    int sum = 0;
    for(int i:nums){
      sum+=i;
    }
    System.out.println("Sum of Element is : "+sum);
  }
}
