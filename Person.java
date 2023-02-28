//WAP (menu driven) to demonstrate method overriding in java, by     displaying details of a student, and a teacher 

import java.util.Scanner;

class Person {
    String name;
    int age;
    String occupation;

    Person(String name, int age, String occupation) 
	{
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    void displayDetails() 
	{
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
    }
}

class Student extends Person
 {
    String course;

    Student(String name, int age, String course) 
	{
        super(name, age, "Student");
        this.course = course;
    }

   
}

class Teacher extends Person 
{
    String subject;

    Teacher(String name, int age, String subject)
 {
        super(name, age, "Teacher");
        this.subject = subject;
    }

   
    }

 class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("1. Display Student Details");
        System.out.println("2. Display Teacher Details");
        System.out.print("Enter your choice: ");
        choice = scan.nextInt();

        switch (choice) {
            case 1:
                Student s = new Student("John", 21, "Computer Science");
                s.displayDetails();
                break;
            case 2:
                Teacher t = new Teacher("Jane", 35, "Mathematics");
                t.displayDetails();
                break;
            default:
                System.out.println("Invalid Choice!");
        }
        scan.close();
    }
}

