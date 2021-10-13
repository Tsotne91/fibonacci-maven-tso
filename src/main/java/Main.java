
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number==0) System.out.println('0');
        else {
            int[] arr;
            arr = new int[number + 1];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i <= number; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.println(arr[number]);
        }
    }
}