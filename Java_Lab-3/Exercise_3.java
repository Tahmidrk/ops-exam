/*3. Create a base class Person with:
a. Instance variables name (String) and id (int).
b. A parameterized constructor to initialize these variables.
Create a subclass Employee with:
a. Additional variables designation (String) and salary (double).
b. A constructor that initializes all four variables using super for name and id.*/

class Person{
    private String name;
    private int id;

    public Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
class Employee extends Person {
    private String designation;
    private double salary;

    public Employee(String name, int id, String designation, double salary){
        super(name, id);
        this.designation=designation;
        this.salary=salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Designation: "+designation);
        System.out.println("Salary: "+salary);
    }
}


public class Main {
    public static void main(String[] args) {
        Employee employee= new Employee("Rakin",131,"Manager",50000.00);
        System.out.println("Employee Details:");
        employee.displayDetails();
    }
}

/*Output:
Employee Details:
Name: Rakin
ID: 131
Designation: Manager
Salary: 50000.0
*/
