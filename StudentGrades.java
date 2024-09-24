import java.util.Scanner;

public class StudentGrades {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of subjects from the user
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Array to store the marks for each subject
        int[] marks = new int[numSubjects];
        int totalMarks = 0;
        
        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i]; // Sum up the marks
        }
        
        // Calculate the average percentage
        double averagePercentage = (double) totalMarks / numSubjects;
        
        // Calculate grade based on the average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        // Display the results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
