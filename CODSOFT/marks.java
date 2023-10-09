import java.util.Scanner;

public class marks{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the total no.of subjects: ");
        int n= s.nextInt();
        int total = 0;
        for (int i = 1; i <=n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = s.nextInt();
            total += marks;
        }

        float average_Percentage = (float) total / (n * 100) * 100;

        char grade;
        if (average_Percentage >= 90) {
            grade = 'A';
        } else if (average_Percentage >= 80) {
            grade = 'B';
        } else if (average_Percentage >= 70) {
            grade = 'C';
        } else if (average_Percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks == " + total);
        System.out.println("Average Percentage == " + average_Percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
