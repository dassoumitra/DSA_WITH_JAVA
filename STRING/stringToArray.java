public class stringToArray {
  public static void main(String[] args) {
    String location = "Kolkata, Bangalore, Pune, Hydrabadh, Chennai";

    String myLocation[] = location.split(",");
    System.out.println(myLocation.length);
    for(int i=0; i<myLocation.length; i++){
      System.out.print(myLocation[i]+" ");
    }
    System.out.println();

    String email1 = "Soumitrad860@gmail.com";
    String email2 = "randomVenger@hotmail.com";

    int firstIndex = email1.indexOf('@');
    int lastIndex = email1.indexOf('.');
    System.out.println(email1.substring(firstIndex+1, lastIndex));
  }
}
