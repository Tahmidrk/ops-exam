import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String grade;

    // Constructors
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(String name, int age) {
        this(name, age, "A");
    }

    public Student(String name) {
        this(name, 18, "B");
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Student 1
        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Grade: ");
        String grade1 = scanner.nextLine();

        // Taking input for Student 2
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Taking input for Student 3
        System.out.println("\nEnter details for Student 3:");
        System.out.print("Name: ");
        String name3 = scanner.nextLine();

        // Creating Student objects using different constructors
        Student student1 = new Student(name1, age1, grade1);
        Student student2 = new Student(name2, age2);
        Student student3 = new Student(name3);

        // Displaying Student details
        System.out.println("\nStudent 1:");
        student1.display();

        System.out.println("\nStudent 2:");
        student2.display();

        System.out.println("\nStudent 3:");
        student3.display();

        scanner.close();
    }
}

