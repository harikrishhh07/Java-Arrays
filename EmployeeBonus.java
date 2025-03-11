import java.util.Scanner;
public class EmployeeBonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextDouble();
                if (salary[i] > 0 && yearsOfService[i] >= 0) break;
                System.out.println("Invalid input. Please enter again.");
                i--;
            }
        }
        for (int i = 0; i < 10; i++) {
            bonus[i] = (yearsOfService[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        sc.close();
    }
}