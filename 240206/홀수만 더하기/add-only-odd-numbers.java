import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0 ;
        n = sc.nextInt();
        for (int i = 1 ; i <= n ; i ++){
            int num = sc.nextInt();
            if(num%2==1 && num%3 == 0){
                sum += num ; 
            }
        }
        System.out.println(sum);
    }
}