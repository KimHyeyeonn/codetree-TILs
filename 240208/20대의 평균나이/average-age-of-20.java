import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0, cnt = 0 ;
        while(true){
            int n = sc.nextInt();
            if(n <=29 && n >= 20){
                sum += n ;
                cnt++ ;
            }else{
                break;
            }
        }
        System.out.printf("%.2f",(sum/cnt));
    }
}