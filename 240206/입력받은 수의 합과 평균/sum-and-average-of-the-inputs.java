import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        double avg ;

        n = sc.nextInt();
        for(int i = 1 ; i <= n; i++){
            int a ;
            a = sc.nextInt();
            sum += a ;
            }
        

        //평균
        avg = (double)sum / n ;

        //출력 
        System.out.printf("%d %.1f",sum, avg);
 
    }
}