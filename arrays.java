import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        double avg = (double) sum / n;
        for (int i = 0; i < n; i++) {
            if (arr[i] > avg)
                System.out.println(arr[i]);
        }
    }
}