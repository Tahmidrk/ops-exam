import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a[]=new int[5];
//        System.out.println("Enter 5 elements:");
//        for(int i=0;i<5;i++){
//            a[i]=sc.nextInt();
//        }
        int a[]={1,2,3,4,5};
        System.out.println("The reversed array is:");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}