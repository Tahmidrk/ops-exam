class Animal1{
    Animal1(){
        System.out.println("Animal constructor");
    }
}
class Dog1 extends Animal1{
    Dog1(){
        super();
        System.out.println("Dog constructor");

    }
}
public class super2{
    public static void main(String[] args){
        Dog1 d = new Dog1();

    }
}