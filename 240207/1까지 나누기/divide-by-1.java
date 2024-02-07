import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,i, div = 0, cnt = 0;
        n = sc.nextInt();
       div = n ;
        for (i = 1; i <= n; i++) {
            div /= i ;
            cnt++;
            if (div <= 1) {
                System.out.println(cnt);
                break;
            }
        }
    }
}