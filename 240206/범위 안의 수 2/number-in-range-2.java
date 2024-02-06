import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, cnt = 0;
        double avg ;
        
        
        for(int i = 0 ; i < 10; i++){
            int n ;
            n = sc.nextInt();
            if(n >= 0 && n <= 200){
                sum += n ;
                cnt ++;
            }
        }

        //평균
        avg = (double)sum / cnt ;

        //출력 
        System.out.printf("%d %.1f",sum, avg);
    }
}