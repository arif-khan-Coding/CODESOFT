import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of subject : ");
        int numSubjects = sc.nextInt();

        int[] marks = new int [numSubjects];
        int totalMarks = 0;

        for(int i = 0; i < numSubjects; i++) {
            int mark;
            do {
                System.out.print("Enter Marks for subject : " + (i + 1) + ": ");
                mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid Input ! Marks should be valid between 0 and 100.");
                }
            } while (mark < 0 || mark > 100);
            marks[i] = mark;
            totalMarks += marks[i];
        }
        double averagePercent = (double) totalMarks / numSubjects;

        System.out.println("Total Marks : "+totalMarks);
        System.out.println("Average percent : "+ averagePercent);

        char grade ;
        if(averagePercent >= 90) {
            grade = 'A';
        } else if (averagePercent >= 80) {
            grade = 'B';
        } else if (averagePercent >= 70) {
            grade = 'C';
        } else if (averagePercent >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(" Grade : " + grade);
        sc.close();
    }
}