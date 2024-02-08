import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int stars = (n - i) * (n - i); // 각 줄마다 출력할 별의 개수를 계산합니다.
            for(int j = 0; j < stars; j++) {
                System.out.print("*");
                if((j+1) % (n - i) == 0 && j != stars - 1) { // 별 n - i개 마다 공백을 추가합니다.
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}