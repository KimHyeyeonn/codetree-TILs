import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        
        // 10개의 숫자를 입력 받아 홀수의 개수를 세기
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 1) {
                cnt++;
            }
        }
        
        // 홀수의 개수 출력
        System.out.println(cnt);

        // Scanner 닫기
        sc.close();
    }
}