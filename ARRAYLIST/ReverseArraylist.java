
import java.util.ArrayList;

public class ReverseArraylist {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(10);
    nums.add(220);
    nums.add(30);
    nums.add(34);
    
    if(nums.isEmpty()){
      System.out.println("list is empty");
      return;
    }
    System.out.println(nums);


    // Collections.reverse(nums);//built in method
    // System.out.println(Collections.max(nums));

    System.out.println(nums);
    int i=0;
    int j=nums.size()-1;
    while (i<j) {
      int temp = nums.get(i);
      nums.set(i,nums.get(j));
      nums.set(j,temp);
      i++;
      j--;
    }
    System.out.println(nums);
  }

  
}
