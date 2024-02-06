import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum = 0 ;
        
        a = sc.nextInt();
        b = sc.nextInt();

        if(a > b){
              for (int i = b ; i <= a ; i ++){
                if(i%2==0){
                    sum += i ; 
                }
            }
        }else if(a == b){
            sum = 0 ;
        }else{
              for (int i = a ; i <= b ; i ++){
                if(i%2==0){
                    sum += i ; 
                }
            }

        }

        //출력 
        System.out.print(sum);
    }
}