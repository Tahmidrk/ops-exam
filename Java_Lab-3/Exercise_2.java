/*
2. Create a class Person with the following:
a. Instance variables name (String) and age (int).
b. A parameterized constructor to initialize name and age.
c. A copy constructor that creates a new Person object as a copy of an existing
one.
d. A method displayDetails() to print the person&#39;s details.
e. In the main method, create one Person object and another using the copy
constructor, then display both.*/


public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Person(Person other){
        this.name=other.name;
        this.age= other.age;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        Person p1= new Person("Rakin",18);
        Person p2= new Person(p1);

        System.out.println("Person 1:");
        p1.displayDetails();

        System.out.println("Person 2:");
        p1.displayDetails();
    }
}
/*
Output:
Person 1:
Name: Rakin
Age: 18
Person 2:
Name: Rakin
Age: 18
*/
