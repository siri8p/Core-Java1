import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        //int a[]= {5,7,4,89,3};
        // int element =56;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the array size");
             int size =  s.nextInt();
             int a[] = new int[size];
        System.out.println("enter the elements");
             for(int i=0;i<a.length;i++){
                   a[i]         = s.nextInt();
             }

         int b[] = new int[a.length+1];
        System.out.println("enter the new element");

        // b[0]= element;
               int element=s.nextInt();
        b[0]= element;
         for(int i=0;i<a.length; i++){
             b[i+1]   =      a[i];

          }
        for(int i=0;i<b.length; i++){
           System.out.println(b[i]);
       }



    }
}
