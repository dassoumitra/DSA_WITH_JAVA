// 4. Print the first n terms of an arithmetic progression for the given first term and
// (a_{k}=a+(k-1)d\)
import java.util.Scanner;

public class Arithmetic {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter first term(a): ");
    int a = sc.nextInt();
    System.out.print("Enter common difference(d): ");
    int d = sc.nextInt();
    System.out.print("Enter last term(n): ");
    int n = sc.nextInt();
    System.out.println("Arithmetic Progression: ");
    int term;
    for(int i=0; i<n; i++){
      term = a+i*d;
      System.out.print(term+" ");

    }
    sc.close();

    System.out.println("hi");
  }
}
