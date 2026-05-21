public class operator {
  public static void main(String[] args) {
    String str = "Soumitra Das";
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    System.out.println(str.charAt(0));
    System.out.println(str.indexOf('m'));
    System.out.println(str.lastIndexOf('s'));
    System.out.println(str.length());
    char ch[] = str.toCharArray();
    for(int i=0; i<ch.length; i++){
      System.out.print(ch[i]+" "); 
    }
  }

  
}