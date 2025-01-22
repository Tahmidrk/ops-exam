/*1. Write a Student class with the following:
a. Instance variables name, age, and grade (all private).
b. A constructor that takes all three variables as parameters.
c. Another constructor that takes only name and age, and sets a default grade of &quot;A&quot;.
d. Another constructor that takes only name and sets default age to 18 and grade to &quot;B&quot;.
e. In the main method, create three students using all three constructors and display their
details.
2. Create a class Person with the following:*/

public class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    public Student(String name, int age){
        this(name,age,"A");
    }
    public Student(String name){
        this(name,18,"B");
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
    }

    public static void main(String[] args) {
        Student student1= new Student("Rakin",20,"A+");
        Student student2= new Student("Saif",18);
        Student student3 = new Student("Shreya");

        System.out.println("Student 1:");
        student1.display();

        System.out.println("Student 2:");
        student1.display();

        System.out.println("Student 3:");
        student1.display();
    }
}
/*Output:
Student 1:
Name: Rakin
Age: 20
Grade: A+
Student 2:
Name: Rakin
Age: 20
Grade: A+
Student 3:
Name: Rakin
Age: 20
Grade: A+
*/
