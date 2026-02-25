import java.util.Scanner;

class Student{
  int roll;
  String name;
  float marks;

  Student(int roll, String name, float marks){
    this.roll = roll;
    this.name = name;
    this.marks = marks;
  }
}



public class ArrayOfObject {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter total no. of students: ");
    int size = sc.nextInt();
    Student[] students = new Student[size];

    //System.out.print("Enter roll no: ");
    for(int i=0; i<students.length; i++){
      System.out.print("Enter details of students "+(i+1)+" : ");
      System.out.print("Enter roll no. : ");
      int roll = sc.nextInt();
      System.out.print("Enter name of student: ");
      String name = sc.next();
      System.out.print("Enter marks : ");
      Float marks = sc.nextFloat();

      students[i] = new Student(roll, name, marks);
    }

    //Display details 
    for(int i=0; i<students.length; i++){
      System.out.print("\nRoll: "+students[i].roll+", Name: "+students[i].name+" and Marks: "+students[i].marks);
    }
    sc.close();
  }
}
