import java.util.Scanner;

public class Task1a_PrintMatrix {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int number;
        System.out.println("Enter number: ");
        number = one.nextInt();
        int[][] matrix = new int[number][number];
        int sum = 1;

        for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {
                matrix[j][i] = sum++;
            }

        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (10 > matrix[i][j]) {
                    System.out.print(matrix[i][j] + "  ");
                } else {
                    System.out.print(matrix[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
