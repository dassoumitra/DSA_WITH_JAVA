public class TypeConversion {
  public static void main(String[] args) {
    //implicit type conversion
    int a = 55;
    double d = a;
    System.out.println(d);


    //explicit type conversion
    float a1 = 45.5F;
    int a2 =(int) a1;
    System.out.println(a2);


    //char to int 
    char c1 = 'A';
    c1++;
    int val = c1;
    System.out.println(val);
  }

  
}