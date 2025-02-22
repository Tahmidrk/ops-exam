import java.sql.SQLOutput;

class Patient{
    private String name;
    private int age;
    private String occupation;
    private String familyHistory;
    private String disease;
    private String traumaticExp;
    private String mentalHealth;

    Patient(String name, int age, String occupation,String familyHistory,String disease,String traumaticExp,String mentalHealth) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.familyHistory = familyHistory;
        this.disease=disease;
        this.traumaticExp=traumaticExp;
        this.mentalHealth=mentalHealth;

    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println("Family History: " + familyHistory);
        System.out.println("Disease: "+disease);
        System.out.println( "Traumatic Exp: " + traumaticExp);
        System.out.println( "Mental Health: " + mentalHealth);
    }
}


public class Main {
    public static void main(String[] args) {
        Patient p1=new Patient("Sama",18,"Student","No","Blood Pressure","Accident","Anxity");
        Patient p2=new Patient("Rakin",19,"Student","Yes","Blood Pressure","Bullying","Anxity");
            p1.display();
        System.out.println();
            p2.display();
    }
}