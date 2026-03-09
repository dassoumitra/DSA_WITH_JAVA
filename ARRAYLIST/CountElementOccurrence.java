import java.util.ArrayList;
import java.util.Scanner;

public class CountElementOccurrence {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(10);
    nums.add(220);
    nums.add(30);
    nums.add(34);
    nums.add(10);
    nums.add(10);
    
    if(nums.isEmpty()){
      System.out.println("list is empty");
      return;
    }

    System.out.println(nums);
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter element from above list: ");
    int target = sc.nextInt();
    int count = 0;
    for(int num : nums){
      if(num == target){
        count++;
      }
    }
    System.out.println("Target element "+target+" = "+count+" times.");
    sc.close();
  }
}
