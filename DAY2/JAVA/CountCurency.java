import java.util.Scanner;

class CountCurency {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.print("Enter your amount : ");
    int amount = sc.nextInt();
    //int  restAmount = 1;
    if(amount>=500){
      System.out.println("No of 500 currency is: "+(amount/500));
      amount= amount%500;
      //System.out.println(restAmount);
    }
    if(amount>=200){
      System.out.println("No of 200 currency is :"+(amount/200));
      amount %= 200;
    }
    if(amount>=100){
      System.out.println("No of 100 currency is: "+(amount/100));
      amount%=100;
    }
    if(amount>=50){
      System.out.println("No of 50 currency is: "+(amount/50));
      amount%=50;
    }
    if(amount>=20){
      System.out.println("No of 20 currency is: "+(amount/20));
      amount%=20;
    }
    if(amount>=10){
      System.err.println("No of 10 currency is : "+(amount/10));
      amount%=10;
    }
    if(amount>=5){
      System.out.println("No of 5 currency is: "+(amount/5));
      amount%=5;
    }
    if(amount>=2){
      System.out.println("No of 2 currency is: "+(amount/2));
      amount%=2;
    }
    if(amount>=1){
      System.out.println("No of 1 Currency is : "+(amount/1));
    }
  
  
  
  
  sc.close();
  }

  
}