import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // n번째 줄까지의 별표 출력
        for (int i = 1; i <= n; i++) {
            // 현재 줄 전에 공백 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            // 현재 줄의 별표 출력
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}