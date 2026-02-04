public class Operator {
  public static void main(String[] args) {
    int a =5;
    int b = a++;
    System.out.println("a++: "+b);
    int c= ++a;
    System.out.println("++a: "+c);
    System.out.println(a++ + ++a);
  }
}
