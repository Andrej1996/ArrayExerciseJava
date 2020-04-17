import java.util.Scanner;

public class Task1b_PrintMatrix {
    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);
        System.out.print("Input matrix size: ");
        int number;
        number = one.nextInt();

        int[][] matrix = new int[number][number];
        int sum = 1;
        boolean rotate = false;

        for (int i = 0; i < number; i++) {
            if (rotate == false) {
                for (int j = 0; j < number; j++) {
                    matrix[j][i] = sum++;
                    rotate = true;
                }
            } else {
                    for (int j = number - 1; j >= 0; j--)
                        matrix[j][i] = sum++;
                    rotate = false;
                }
            }

            for (int a = 0; a < number; a++) {

                for (int b = 0; b < number; b++) {

                    if (10 > matrix[a][b]) {
                        System.out.print(matrix[a][b] + "  ");
                    } else {
                        System.out.print(matrix[a][b] + " ");
                    }
                }

                System.out.println();
            }
        }
    }

