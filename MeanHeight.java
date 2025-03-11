import java.util.Scanner;
public class MeanHeight{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double totalHeight = 0;
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter the height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            totalHeight += heights[i];
        }
        double meanHeight = totalHeight / 11;
        System.out.println("The mean height of the football team is: " + meanHeight);
    }
}