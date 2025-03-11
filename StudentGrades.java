import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] physics = new int[n], chemistry = new int[n], maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + " (out of 100):");
            physics[i] = getValidMarks(sc, "Physics");
            chemistry[i] = getValidMarks(sc, "Chemistry");
            maths[i] = getValidMarks(sc, "Maths");
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            grade[i] = percentage[i] >= 80 ? "A" : percentage[i] >= 70 ? "B" : percentage[i] >= 60 ? "C" : 
                       percentage[i] >= 50 ? "D" : percentage[i] >= 40 ? "E" : "R";
        }
        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++)
            System.out.printf("%d\t%d\t\t%d\t%.2f%%\t\t%s\n", physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        sc.close();
    }
    public static int getValidMarks(Scanner sc, String subject) {
        int marks;
        while (true) {
            System.out.print(subject + ": ");
            marks = sc.nextInt();
            if (marks >= 0 && marks <= 100) return marks;
            System.out.println("Invalid input! Enter marks between 0 and 100.");
        }
    }
}