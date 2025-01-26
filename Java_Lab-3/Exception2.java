public class Main {
    public static void main(String[] args) {
     try{
         int number[]=new int[10];
         System.out.println("Print:"+number[11]);
         number[11]=30/0;
         int num=30/0;
     }
     catch (ArithmeticException |ArrayIndexOutOfBoundsException e){
         System.out.println("Error message:"+e);
     }
//     catch (ArrayIndexOutOfBoundsException e){
//         System.out.println("Index out of size of the array");
//     }
      
     }
    }

