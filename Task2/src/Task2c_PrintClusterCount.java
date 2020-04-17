import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Task2c_PrintClusterCount {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int number;
        int x;
        int count = 0;

        System.out.println("Enter number: ");
        number = one.nextInt();
        System.out.printf("Enter %d numbers: ", number);

        int[] arrays = new int[number];
        for (int i = 0; i < number; i++){
            arrays[i] = one.nextInt();
        }
        System.out.print("Enter number you want to check: ");

        x = one.nextInt();
        for (int i = 0; i < number; i++) {
            if (arrays[i] == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
