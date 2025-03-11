import java.util.Scanner;
public class Friend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }        
        int youngestIndex = 0;
        double tallestIndex = 0;        
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[(int)tallestIndex]) tallestIndex = i;
        }      
        System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[(int)tallestIndex] + " (Height: " + heights[(int)tallestIndex] + " cm)");     
        sc.close();
    }
}