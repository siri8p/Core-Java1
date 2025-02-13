import java.util.Scanner;

public class Repeating {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("enter the  word");
//            String  str =   s.nextLine();
//             int  i= str.length();
//        Scanner s1 = new Scanner(System.in);
//        System.out.println(" enter the element to repeat");
//               String str1 =    s1.next();
//            str = str.replace(str1," ");
//               int  f=   str.length();
//        System.out.println("occurence of  character " +str1  +" " +(i - f));
//
//
//
//    }
//}
        Scanner s = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the word:");
        String str = s.nextLine();

        // Input the element to repeat (the character)
        System.out.println("Enter the element to repeat:");
        String str1 = s.next();

        // Count the occurrences of the character
        int i = str.length();  // Original length of the string
        str = str.replace(str1, " ");  // Replace the character with a space
        int f = str.length();  // New length of the string after replacement

        // Calculate and print the occurrences
        System.out.println("Occurrence of character '" + str1 + "' is: " + (i - f));

        s.close();
    }
}