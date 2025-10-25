package Assignments;

public class SkipMultiplesOf5 {
    public static void main(String[] args) {
        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Skip numbers that are multiples of 5
            if (i % 5 == 0) {
                continue; // skips this iteration
            }
            System.out.print(i + " ");
        }
    }
}

