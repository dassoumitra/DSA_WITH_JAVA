import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter String: ");
    String str = sc.nextLine();
    reverseString(str);
  }
  public static void reverseString(String input){
    String ans = "";
    for(int i = 0; i < input.length(); i++){
      ans = input.charAt(i) + ans;
    }
    System.out.println(ans);
  }
}
