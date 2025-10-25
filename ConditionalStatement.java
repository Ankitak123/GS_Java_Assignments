package Assignments;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Accept marks for three subjects
        System.out.print("Enter marks for Math: ");
        int math = sc.nextInt();

        System.out.print("Enter marks for Science: ");
        int science = sc.nextInt();

        System.out.print("Enter marks for English: ");
        int english = sc.nextInt();

        // 2. Calculate average
        double average = (math + science + english) / 3.0;

        // 5. Bonus check: any subject below 35
        boolean lowScore = (math < 35 || science < 35 || english < 35);

        // 3. Determine grade
        String grade;
        if (average >= 90 && average <= 100) {
            grade = "A+";
        } else if (average >= 75) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // 4. Print grade and custom message
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);

        if (lowScore) {
            System.out.println("Failed due to low score in at least one subject.");
        } else {
            if (grade.equals("Fail")) {
                System.out.println("Please work harder next time.");
            } else if (grade.equals("A+") || grade.equals("A")) {
                System.out.println("Excellent performance!");
            } else {
                System.out.println("Keep improving.");
            }
        }

        sc.close();
    }
}
