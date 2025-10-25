package Assignments;

public class Table {
    public static void main(String[] args) {
        int number = 7;

        System.out.println("Multiplication Table of " + number + ":");

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

