import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            // 변수 선언 및 입력
            int n, h;
            n = sc.nextInt();
            h = sc.nextInt();
            String x = sc.next();
            if( x.equals("C")){
                System.out.println(n*h);
                break;
            }else{
                System.out.println(n*h);
            }

        }
    }
}