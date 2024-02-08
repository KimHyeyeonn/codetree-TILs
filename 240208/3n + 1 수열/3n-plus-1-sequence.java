import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int result = n ;
        while(true){
            if(result == 1){
                break;
            }else{
                 if(result % 2 == 0 ){
                result = result/2 ;
                cnt++;
            }else{
                result = result*3 + 1 ;
                cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}