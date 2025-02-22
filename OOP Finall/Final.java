class Student1{
    final int rollNumber;
    Student1(int rollNumber){
        this.rollNumber = rollNumber;
    }
    void display(){
        System.out.println("Roll Number:"+rollNumber);
    }
}
public class Final{
    public static void main(String[] args) {
        Student1 s1=new Student1(145);
        Student1 s2=new Student1(131);
        s1.display();
        s2.display();
    }
}