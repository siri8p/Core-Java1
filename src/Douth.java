import java.util.Scanner;

public class Douth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements");

        for (int i = 0; i < arr.length-1; i++) {

            arr[i] = s.nextInt();


        }
        System.out.println("printing elements before insert");
        for( int i: arr){
            System.out.println(i);
        }
        System.out.println("enter the location at which we want to insert");
                 int location = s.nextInt();
        System.out.println("enter the location at which we want to insert");
        int value= s.nextInt();
  for(int i=arr.length-1;i>location;i--){
      arr[i]= arr[i-1];

  }
   arr[location]=value;
      for(int i:arr){
          System.out.println(i);
        }

    }
    }
