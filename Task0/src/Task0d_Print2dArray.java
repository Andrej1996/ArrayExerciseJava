public class Task0d_Print2dArray {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        int sum = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix.length; j++) {
                matrix[i][j] = sum++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ( 10 > matrix[i][j]) {
                    System.out.print(matrix[i][j] + "  ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

