import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's mark (0-100): ");

        if (!in.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number between 0 and 100.");
            in.close();
            return;
        }
        double mark = in.nextDouble();
        if (mark < 0 || mark > 100) {
            System.out.println("Mark must be between 0 and 100.");
            in.close();
            return;
        }
        String grade;
        if (mark >= 80) grade = "A+";
        else if (80> mark && mark >= 75) grade = "A";
        else if (75 > mark && mark >= 70) grade = "A-";
        else if (70 > mark && mark >= 65) grade = "B+";
        else if (65 > mark && mark >= 60) grade = "B";
        else if (60 > mark && mark >= 55) grade = "B-";
        else if (55 > mark && mark >= 50) grade = "C+";
        else if (50 > mark && mark >= 45) grade = "C";
        else if (45 > mark && mark >= 40) grade = "D";
        else grade = "F";
        System.out.printf("Mark: %.2f -> Grade: %s%n", mark, grade);
        in.close();
    }
}
