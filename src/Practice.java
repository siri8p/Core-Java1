import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int a[] ={5,7,6,9};
        int element=89;
        int b[] = new int[a.length+1];
        b[0] =element;
        for(int i=0; i<a.length; i++){
            b[i+1] =a[i];
        }
        for(int i=0; i<b.length;i++){
            System.out.println(b[i]);
        }

    }
}
