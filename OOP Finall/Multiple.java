interface Printable{
    void print();
}
interface Showable{
    void show();
}

public class Multiple implements Printable, Showable{
    @Override
    public void print() {
        System.out.println("Cr");
    }

    @Override
    public void show() {
        System.out.println("Mohit");
    }

    public static void main(String[] args) {
        Multiple m = new Multiple();
        m.print();
        m.show();
    }
}