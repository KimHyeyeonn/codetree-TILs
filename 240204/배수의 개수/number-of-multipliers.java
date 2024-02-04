import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt_3 = 0 , cnt_5 = 0;
        
        // 10개의 숫자를 입력 받아 홀수의 개수를 세기
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 3 == 0 ) {
                cnt_3++;
            }
            if (num % 5 == 0){
                cnt_5++ ;
            }
        }
        
        // 홀수의 개수 출력
        System.out.print(cnt_3 +" "+ cnt_5);

        // Scanner 닫기
        sc.close();
    }
}