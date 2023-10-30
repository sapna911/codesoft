              //Student Grade Calculator



import java.util.Scanner;

public class task2{
    public static void main(String[] args) {
         // Create a Scanner object for user input.

        Scanner scanner = new Scanner(System.in);
       //Ask the user for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            // Promot the user to enter marks for each subject
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        //Calculate the average percentage

        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        char grade;
//Determine the grade based on the average percentage
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
//Display the total marks,average percentage and grade
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
//Close the scanner to release resources
        scanner.close();
    }
}