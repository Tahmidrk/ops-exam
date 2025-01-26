import java.util.Arrays;

class Student{
    String name;
    int[]grades;//mutable

    Student(String name,int[]grades){
        this.name=name;
        this.grades=grades;
    }
    Student(Student s){
        this.name=s.name;
        this.grades= Arrays.copyOf(s.grades,s.grades.length);//deep copy
    }
    void display(){
        System.out.println("Name"+name+",Grades:"+Arrays.toString(grades));
    }
}

public class Main {
    public static void main(String[] args) {
        int[]grades={85,90,95};
        Student s1=new Student("Rakin",grades);
        Student s2=new Student(s1);
        s1.display();
        s2.display();
        s1.grades[0]=75;
        s1.display();
        s2.display();

    }
}

/*output:
NameRakin,Grades:[85, 90, 95]
NameRakin,Grades:[85, 90, 95]
NameRakin,Grades:[75, 90, 95]
NameRakin,Grades:[85, 90, 95]
*/

