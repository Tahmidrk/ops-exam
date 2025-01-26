public class Main {
    public static void main(String[] args) {
     int[]arr={0,1,2,3,4,5};
     try {
         for (int i = 0; i <= arr.length; i++) {
             System.out.println(arr[i] + " ");
         }
     }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Exception found");
         }
         System.out.println("Safe end of the programme");
     }
    }
