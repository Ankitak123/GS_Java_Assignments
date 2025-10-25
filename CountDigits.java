package Assignments;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = number;

        // Handle 0 case separately
        if (temp == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (temp != 0) {
                temp = temp / 10; // remove last digit
                count++;          // increment digit count
            }
        }

        // Output result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}

