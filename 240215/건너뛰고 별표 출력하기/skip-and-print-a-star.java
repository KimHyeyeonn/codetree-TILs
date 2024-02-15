import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();

        // 별표 출력 (위쪽 부분)
        for (int i = 1; i <= n; i++) {
            // 별표 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();

            // 공백 출력
            System.out.println();
        }

        // 별표 출력 (아래쪽 부분)
        for (int i = n - 1; i >= 1; i--) {
            // 별표 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();

            // 공백 출력
            System.out.println();
        }

        // 스캐너 닫기
        scanner.close();
    }
}