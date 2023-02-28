import java.util.Scanner;
class Teacher
{
 String name = new String();
 int age;
 void read(int x)
 {
 Scanner sc = new Scanner(System.in);
 System.out.print("\nTeacher details\nEnter the teacher name: ");
 name = sc.nextLine();
 System.out.print("\nEnter the teacher age: ");
 age = sc.nextInt();
 }
 void disp()
 {
 System.out.print("\nTeacher\nName: " + name + "\nAge: " + age);
 }
}
class Student extends Teacher
{
 String name = new String();
 int age;
 void read(int x)
 {
 if(x == 1)
 super.read(x);
 else
 {
 Scanner sc = new Scanner(System.in);
 System.out.print("\nStudent details\nEnter the student name: ");
 name = sc.nextLine();
 System.out.print("\nEnter the student age: ");
 age = sc.nextInt();
 }
 }
 void disp()
 {
 super.disp();
 System.out.print("\n\nStudent\nName: " + name + "\nAge: " + age);
 }
}
public class School
{
 public static void main(String arg[])
 {
 Scanner sc = new Scanner(System.in);
 Student s = new Student();
 //Teacher t = new Teacher();
 int i = 0;
 System.out.print("\n1: Enter teacher details.\n2: Enter student details.\nEnter your choice: ");
 int c = sc.nextInt();
 do{
 s.read(c);
 if(c == 1)
 c=2;
 else
 c=1;
 i++;
 }while(i <= 1);
 s.disp();
 }
}