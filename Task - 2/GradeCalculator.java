import java.util.Scanner;

public class GradeCalculator {
     
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int no_of_Subject = scanner.nextInt();
        int[] Marks = new int[no_of_Subject];
        int total = 0;
        double avg = 0;

        for (int i = 0; i < no_of_Subject; i++) {

            System.out.print("Enter the marks of subject " + (i + 1) + ": ");
            Marks[i] = scanner.nextInt();
            
            while (Marks[i] > 100 || Marks[i] < 0) {
                System.out.print("Enter a valid mark.\nEnter the marks of subject " + (i + 1) + ": ");
                Marks[i] = scanner.nextInt();
            }

            total += Marks[i];
        }

        System.out.println("Total marks: " + total);
        avg = (double) total / (no_of_Subject * 100);
        double avg_Cent = avg * 100;
        System.out.println("Average percentage: " + avg_Cent);
        printGrade(avg_Cent);

        scanner.close();
    }

        
        private static void printGrade(double percentage) {

            if (percentage >= 90) {
                System.out.println("You have got A+ grade");
            } else if (percentage >= 80 && percentage <= 89) {
                System.out.println("You have got A- grade");
            } else if (percentage >= 65 && percentage <= 79) {
                System.out.println("You have got B+ grade");
            } else if (percentage >= 50 && percentage <= 64) {
                System.out.println("You have got B- grade");
            } else {
                System.out.println("You have got F grade");
            }
        }
}
