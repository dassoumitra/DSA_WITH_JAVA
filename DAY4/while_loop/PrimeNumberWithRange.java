// 17. Print all prime numbers between 1 and 100.

public class PrimeNumberWithRange {
  public static void main(String[] args) {
    int j=1;
    while(j<=100){
      if(j<=1){
        j++;
        continue;
      }
      boolean isPrime = true;
      for(int i=2; i*i<=j; i++){
        if(j%i==0){
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.println(j);  
      }

      j++;

    }
  }
  
}
