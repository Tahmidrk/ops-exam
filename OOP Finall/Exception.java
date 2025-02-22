public class Exception{
    public static void main(String args[]){
        try{
            int data=50/0;
            int [] a={1,2,3,4,5};
            System.out.println(data);
            System.out.println(a[10]);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Safe and exit");
    }
}