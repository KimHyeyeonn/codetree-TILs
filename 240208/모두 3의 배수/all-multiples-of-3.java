import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean satisfied = true;
        for (int i = 1; i <= 5; i++) {
             int a = sc.nextInt();
             if(a % 3 != 0){
                satisfied = false ;
                break; // 3의 배수가 아닌 수가 발견되면 더 이상 확인할 필요가 없으므로 반복문을 종료합니다.
             }
        }
        if (satisfied == true) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}