//4. Print all odd numbers between 1 and 100

public class OddNumber {
  public static void main(String[] args) {
    int i =1;
    System.out.println("All odd number from 1 to 100");
    while (i<=100) {
      if(i%2!=0)
        System.out.print(i+" ");
      i++;
      
    }
  }
  
}
