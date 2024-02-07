import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , multi = 1;
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            multi *= i ;
            if (multi >= n) {
                System.out.println(i);
                break;
            }
        }
    }
}