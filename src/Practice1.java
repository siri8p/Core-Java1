import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
        System.out.println(" enter the array soze");
           int size=   s.nextInt();
           int a [] = new int[size];
        System.out.println("enter the elements");
            for(int i =0; i<size ;i++) {
                a[i] = s.nextInt();
            }


    }
}
