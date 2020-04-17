import java.util.Scanner;
//--------------------<< Ne e zavyrshena! >>-----------------------------
public class Task2d_PrintSplitIndex {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int number;
        System.out.println("Enter number: ");
        number = one.nextInt();

        int[] array = new int[number];
        int sum1 = 0;
        int sum2 = 0;
        boolean p = true;
        int n = 0;

        for (int i = 0; i < number; i++) {
            if (number > 1) {
                array[i] = one.nextInt();
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                sum1 *= array[j];
            }
            if (sum1 == sum2) {
                n = i;
                p = true;
            }
            sum1 = 0;
            sum2 = 0;

        }
        if (p) {
            System.out.println(n);
        } else {
            System.out.println("No!");
        }

    }
}
