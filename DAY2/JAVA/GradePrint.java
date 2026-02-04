import java.util.Scanner;

public class GradePrint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks : ");

    double marks = sc.nextDouble();

    if(marks>=90)
      System.out.println("Grade A");
    else if(marks>=75)
      System.out.println("Grade B");
    else if(marks>=60)
      System.out.println("Grade C");
    else
      System.out.println("Fail");
    sc.close();
  }
}
