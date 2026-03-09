import java.util.ArrayList;

public class CreateList {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();

    nums.add(5);
    nums.add(10);
    nums.add(15);
    nums.add(20);
    nums.add(52);
    System.out.println(nums);

    //using size()
    for(int i=0; i<nums.size(); i++){
      System.out.print(nums.get(i)+" ");
    }

    //access 3rd element
    System.out.println();
    System.out.println(nums.get(2));
    
    //update the second element
    nums.set(1, 100);
    System.out.println(nums);

    //remove element
    nums.remove(2);
    System.out.println(nums);
  }
}
