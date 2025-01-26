import java.util.Scanner;

class Student{
    private String name;
    private int grade;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setGrade(int grade) {
        if (grade>=0&&grade<=100){
            this.grade=grade;
        }
        else {
            System.out.println("Invalid grade!");
        }
    }

    public int getGrade() {
        return grade;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Name:");
        String name1= scanner.nextLine();
        Student s=new Student();
        s.setName(name1);
        s.setGrade(85);
        System.out.println("Name:"+s.getName());
        System.out.println("Grade:"+s.getGrade());
        scanner.close();
    }
}
