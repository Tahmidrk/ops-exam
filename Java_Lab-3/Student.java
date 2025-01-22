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