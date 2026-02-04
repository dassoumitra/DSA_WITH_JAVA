import java.util.Scanner;

public class CheckVowelOrConsonant {

  public static void main(String[] args) {
    char c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any Character: ");

    c = sc.next().charAt(0);

    if((c=='a' || c=='e' || c=='i' || c=='o' || c=='u') || (c=='A' || c=='E' || c=='I' || c=='O' || c=='U'))
      System.out.println(c+" is a Vowel.");
    else
      System.out.println(c+" is a consonant.");
    sc.close();
  }
}