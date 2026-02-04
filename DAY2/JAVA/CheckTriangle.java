import java.util.Scanner;

//import javax.swing.text.html.StyleSheet;

public class CheckTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double angle1, angle2, angle3;
    System.out.print("Enter Value of angle1: ");
    angle1 = sc.nextDouble();
    System.out.print("Enter Value of angle2: ");
    angle2 = sc.nextDouble();
    System.out.print("Enter Value of angle3: ");
    angle3 = sc.nextDouble();

    if(angle1 + angle2 + angle3 == 180)
      System.out.println("It is a valid triangle.");
    else
      System.out.println("It is not valid triangle.");
    sc.close();
  }
}
