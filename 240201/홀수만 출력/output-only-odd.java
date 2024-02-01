import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        if(a % 2 == 1 && b % 2 == 1){
            for (int i = a; i <= b; i +=2) {
                System.out.print(i + " "); 
            }
            
        }
    }
}