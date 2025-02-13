package ArrayListEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
      //  Scanner s = new Scanner(System.in);
//        System.out.println("enter the elements");
//        String items  =   s.nextLine();
//        ArrayList<String> a = new ArrayList<String>();
//         a.add(items);
//
//        System.out.println(a);
//        while (true) {
//            System.out.print("Enter a number (0 to exit): ");
//            int num = s.nextInt();
//
//            if (num == 0) {
//                System.out.println("Exiting the loop...");
//                break;  // Stops the infinite loop
//            }
//
//            System.out.println("You entered: " + num);
//        }
//
//        s.close();
   // }
//}
//        while (true) {
//            System.out.print("Enter an item (type 'done' to stop): ");
//            String input = s.nextLine();
//
//            if (input.equalsIgnoreCase("done")) {
//                System.out.println("Exiting...");
//                break;  // Stops the loop if the user enters "done" (any case)
//            }
//
//            System.out.println("Added: " + input);
//        }
//
//        s.close();
//        ArrayList<String> groceryList = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Welcome to the Grocery List Program!");
//        System.out.println("Type items to add to the list. Type 'done' to finish.");
//
//        while (true) {
//            System.out.print("Enter item: ");
//            String item = scanner.nextLine().trim();
//
//            if (item.equalsIgnoreCase("done")) {
//                break;
//            }
//
//            groceryList.add(item);
//        }
//
//        System.out.println("\nYour Final Grocery List:");
//        for (int i = 0; i < groceryList.size(); i++) {
//            System.out.println((i + 1) + ". " + groceryList.get(i));
//        }
//
//        scanner.close();
//    }
//}

    ArrayList<String> listofiteams = new ArrayList<>();
          Scanner s= new Scanner(System.in);

          while( true){
              System.out.println("enter the items");
              String  item= s.nextLine().trim();

              if (item .equalsIgnoreCase("done")){
                  System.out.println("exiting of the itesms");
                  break;
              }
                listofiteams.add(item);

          }
        System.out.println("finally gross list");
          for(int i=0; i<listofiteams.size(); i++){
              System.out.println( listofiteams.get(i));
          }


    }
}




