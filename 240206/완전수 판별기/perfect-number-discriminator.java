import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;       

        n = sc.nextInt();
        for(int i = 1 ; i < n; i++){
            if(n % i == 0){
                sum += i ;
            }else{
                sum = sum ;
            }
        }
        if(n == sum){
            System.out.println("P");
        }else{
            System.out.println("N");
        }
    }
}