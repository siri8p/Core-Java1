import java.util.Scanner;

public class Simplecode {
    public static void main(String[] args) {
//         int a[] ={2,3,4,5};
//          for( int b:a){
//              System.out.println(b);
//          }
//          for( int i =0; i<a.length ;i++){
//              System.out.println(a[i]);
//          }
        Scanner scr= new Scanner(System.in);
        System.out.println("enter the array size");
            int size   =  scr.nextInt();
            int arr[] = new int[size];
        System.out.println("enter the array elements");
           for(int i=0;i<arr.length;i++){
               arr[i]     =  scr.nextInt();

         }

          for(int i=0;i<arr.length;i++){
              System.out.println(arr[i]);
          }


    }
}
