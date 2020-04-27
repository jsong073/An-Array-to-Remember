/*
This program will do the following:
1. Receive the names of the last ten presidents in the order they were elected, and store them in an array
2. If the user enters the word history, it will print out the array in reverse order

Process:
1. Initialize variables:
    a. String array to store the presidents' names
    b. Scanner to receive user input
    c. String to to check if user typed "history" or not
2. Prompt user for input, and store responses in an array using a FOR loop
    FOR int i = 0 to 10 exclusive, i++
        array[i] = user input String
    ENDFOR
3. Ask user if they want to type "history" to see the array reversed
    IF user types "history" THEN
        FOR int i = array length - 1 to 0 inclusive, i--
            Print array[i]
        ENDFOR
    ENDIF
 */

import java.util.Scanner;
import java.util.Arrays;

public class ArrayHistory {
    public static void main (String[] args) {
        //Variables
        String[] tenPresidents = new String[10];
        Scanner input = new Scanner(System.in);
        String history = "";

        System.out.println("Enter the names of the last 10 presidents in the order they were elected: ");
        for (int i = 0; i < tenPresidents.length; i++) {
            System.out.print("(" + (i + 1) + "/10): ");
            tenPresidents[i] = input.nextLine();
        }

        System.out.println("Enter the word \"history\" to see the last 10 presidents, going by the most recent order of " +
                        "election.");
        history = input.nextLine();

        if (history.equalsIgnoreCase("history")) {
            for (int i = tenPresidents.length - 1; i >= 0; i--) {
                System.out.println(tenPresidents[i] + " ");
            }
        }

        System.out.println("Goodbye.");

        input.close();
    }
}
