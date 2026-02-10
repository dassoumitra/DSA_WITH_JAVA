package DAY8.mathematicalProblem;
// 5. Print the first n terms of a geometric progression for the given first term and common ratio
import java.util.Scanner;

public class GeometricPropagation {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter first term(a): ");
    int a = sc.nextInt();
    System.out.print("Enter common ratio(r): ");
    int r = sc.nextInt();
    System.out.print("Enter last term(n): ");
    int n = sc.nextInt();
    System.out.println("Geometric Progression: ");
    int term = a;
    for(int i=1; i<=n; i++){
      System.out.print(term+" ");
      term = term*r;

    }
    sc.close();
  }
}
