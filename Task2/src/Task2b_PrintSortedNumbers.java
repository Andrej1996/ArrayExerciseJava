import java.util.Scanner;

public class Task2b_PrintSortedNumbers {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int number1;
        System.out.println("Enter number: ");
        number1 = one.nextInt();
        int temp;

        int[] arrays = new int[number1];
        System.out.printf("Enter %d numbers: ", number1);

        for (int i = 0; i < number1; i++) {
            arrays[i] = one.nextInt();
        }
        for (int i = 0; i < (number1 - 1); i++) {
            for ( int j = 0; j < (number1 - 1 - i); j++) {
                if ( arrays[j] > arrays[j+1] ) {
                    temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted number:");

        for (int i = 0; i < number1; i++) {
            System.out.println(arrays[i]);
        }
    }
}
