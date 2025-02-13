package ArrayListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Charecter {
    public static void main(String[] args) {
//        Scanner s= new Scanner(System.in);
//        System.out.println("enter the string");
//            String st=    s.nextLine();
//          ArrayList<Charecter> ch= new ArrayList<>();
//           for(char c: st.toCharArray()){

//                ch.add(c);
//           }
//
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Store characters in an ArrayList
        ArrayList<Character> charList = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            charList.add(ch);
        }

        // Reverse the ArrayList
        Collections.reverse(charList);

        // Display reversed characters
        System.out.print("Reversed string: ");
        for (char ch : charList) {
            System.out.print(ch);
        }

        scanner.close();
    }
}



