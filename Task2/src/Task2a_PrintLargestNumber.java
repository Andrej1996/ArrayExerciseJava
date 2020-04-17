import java.util.Scanner;

public class Task2a_PrintLargestNumber {
    public static void main(String[] args) {

        Scanner one = new Scanner(System.in);
        int num1;
        System.out.println("Enter number: ");
        num1 = one.nextInt();

        int [] array = new int[num1];
        System.out.printf("Enter %d number: " , num1);
        int large = 0;

        for ( int i = 0; i < num1; i++) {
            array[i] = one.nextInt();
        }
        large = array[0];
        for (int i = 0; i < num1; i++) {
            if ( large < array[i]) {
                large = array[i];

            }
        }
        System.out.println("Largest number is: " + large);
    }
}
