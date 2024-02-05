import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int n;
        n = sc.nextInt();

        int cnt = 0;
    
        // 각 년도마다 확인합니다.
        for(int i = 1; i <= n; i++) {
            if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
                cnt++;
        }

        System.out.println(cnt);
    }
}