package ArrayListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InputOrder {
    public static void main(String[] args) {
//        ArrayList<Integer> al = new ArrayList<>();
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("enter the input elements");
//        int data = s.nextInt();
//             while(true){
//                 if(s.equals("done")){
//                     System.out.println("exit the input");
//                 }
//                al.add(data);
//             }
        //   }
//}

//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        System.out.print("Enter numbers (type 'done' to finish): ");
//        while (scanner.hasNextInt()) {
//            numbers.add(scanner.nextInt());
//        }
//
//        Collections.sort(numbers); // Sorting in ascending order
//
//        System.out.println("Sorted numbers: " + numbers);
//        scanner.close();
//    }
//}

        Scanner s = new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<>();
        System.out.println("enter the number");

        while(s.hasNextInt()) {
             numbers.add(s.nextInt());

        }
   Collections.sort(numbers);
        System.out.println("sorted order:" + numbers);

    }
}
