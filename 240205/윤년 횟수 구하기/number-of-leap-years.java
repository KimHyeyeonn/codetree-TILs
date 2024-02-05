import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int n;
        n = sc.nextInt();

        int cnt = 0;
    
        // 각 날짜마다 확인합니다.
        for(int i = 1; i < n; i++) {
            // 주기가 가장 긴 12일부터 확인합니다.
            if(i % 4 == 0)
                cnt++;
            // 12일 주기에 들어오지 않는다면, 3일 주기에 들어오는지 확인합니다.
            else if(i % 100 == 0 && i % 400 != 0)
                cnt++;
        }

        System.out.println(cnt);
    }
}