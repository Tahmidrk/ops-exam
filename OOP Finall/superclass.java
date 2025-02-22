class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Eating bread...");
    }
    void bark(){
        System.out.println("Barking...");
    }
    void work(){
        super.eat();
        bark();
    }
}
public class superclass {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.work();
    }
}