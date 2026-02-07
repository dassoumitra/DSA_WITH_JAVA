// 24. Print all factors of the given number
// 25. Find and print the sum of all factors of the given number.


import java.util.Scanner;

public class Factor {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    num = sc.nextInt();
    System.out.println("All factor of : "+num);
    int i=1;
    int sum =0;
    while (i*i<=num) {
      if(num%i==0){
        System.out.print(i+" ");
        sum +=i;
        if(i!=num/i){
          int c = num/i;
          System.out.println(c+" ");
          sum+=c;
        }

      }
        
      i++;
    }
    System.out.println("Sum of all factor : "+sum);


    sc.close();
  }
}
