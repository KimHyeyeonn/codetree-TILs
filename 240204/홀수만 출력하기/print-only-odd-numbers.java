import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 n 입력
        int n = scanner.nextInt();

        // 홀수이면서 3의 배수인 수 출력
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 1 && num % 3 == 0) {
                System.out.println(num);
            }
        }

        // Scanner 닫기
        scanner.close();
    }
}