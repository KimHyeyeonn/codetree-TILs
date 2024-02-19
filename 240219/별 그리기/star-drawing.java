import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 위쪽 다이아몬드 출력
        for (int i = 0; i < n; i++) {
            // 왼쪽 공백 출력
            for (int j = 0; j < n - (i + 1); j++) {
                System.out.print(" ");
            }
            // 별표 출력
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }

        // 아래쪽 다이아몬드 출력
        for (int i = n - 2; i >= 0; i--) {
            // 왼쪽 공백 출력
            for (int j = 0; j < n - (i + 1); j++) {
                System.out.print(" ");
            }
            // 별표 출력
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }

        scanner.close();
    }
}