//Count occurrences of a given element

import java.util.Scanner;

public class OccurrenceOfElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of an array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter element one by one: ");
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
    System.out.print("Array : ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.print("Enter element from array : ");
    int ele = sc.nextInt();
    int count=0;
    for(int i=0; i<arr.length; i++){
      if(arr[i]==ele){
        count++;
      }
    }
    System.out.print("Total no. of"+ele+" is : "+count);
    sc.close();
  }
}
