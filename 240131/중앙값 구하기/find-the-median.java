import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b, c;
        
        // 입력
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // 출력
       
        if((a>=b && b>=c) || (c>=b && b >= a)) {
            System.out.println(b);
        }
        else if((b>=a && a>=c) || (c>=a && a >= b)){
            System.out.println(a);
        }else{
            System.out.println(c);
        }
    }
}