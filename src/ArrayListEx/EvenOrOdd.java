package ArrayListEx;

import java.util.ArrayList;
import java.util.Scanner;


public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        System.out.println("Enter numbers (type 'done' to finish):");

        // Taking input from user
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Separating even and odd numbers
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        // Displaying results
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);

        scanner.close();
    }
}



