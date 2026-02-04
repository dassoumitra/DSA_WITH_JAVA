import java.util.Scanner;

public class CalculateBill {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double billUnit , oriBillUnit;
    System.out.print("Enter bill unit : ");
    billUnit = sc.nextDouble();
    oriBillUnit = billUnit;
    double amount = 1;

    if(billUnit >= 100){
      amount = 100*1;
      billUnit-=100;
    }
    if(billUnit>=100){
      amount+=(100*2);
      billUnit-=100;
    }
    if(billUnit>=200)
      amount+=(billUnit*3);
    System.err.println("Total amount for "+oriBillUnit+" is: "+amount);

    sc.close();
  }
}