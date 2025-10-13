package Assignments;

public class Task1 {
	public static void main(String[] args) {
        
        int math = 80;
        int science = 90;
        int english = 85;

        // 2. Calculate total marks using arithmetic operators
        int total = math + science + english;

        // 3. Calculate average using a suitable data type (double)
        double average = total / 3.0;  // Using 3.0 gives accurate decimal result

        // 4. Print total and average
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks (double): " + average);

        // 5. Change data type of average to int and note the difference
        int avgInt = total / 3; // Integer division truncates the decimal part
        System.out.println("Average Marks (int): " + avgInt);
    }
}

