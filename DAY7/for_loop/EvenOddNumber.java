// 3. Print all even numbers between 1 and 100.
// 4. Print all odd numbers between 1 and 100.

public class EvenOddNumber {
  public static void main(String[] args) {
    System.out.println("All Even number from 1 to 100: ");
    for(int i=2; i<=100; i+=2){
      System.out.print(i+" ");
    }
    System.out.println();
    System.out.println("All odd number from 1 to 100: ");
    for(int j=1; j<=100; j+=2){
      System.out.print(j+" ");
    }
  }
}