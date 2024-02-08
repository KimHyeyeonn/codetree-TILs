import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n2 = 1 , x = 0; 
        int n = sc.nextInt();

        while(true){
            n2 = n2*2 ;
            x++ ;
            if( n2 == n ){
                break;
            }
        }System.out.println(x);
        
    }
}