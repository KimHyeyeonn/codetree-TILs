import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int math_a, eng_a, math_b, eng_b;
        
        // 입력
        math_a = sc.nextInt();
        eng_a = sc.nextInt();
        math_b = sc.nextInt();
        eng_b = sc.nextInt();

        if(math_a > math_b){
            System.out.println("A");
        }else if(math_a == math_b){
            System.out.println( eng_a > eng_b ? "A" : "B");
        }
        else{
            System.out.println("B");
        }

    }
        
            
}