import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int mid, fin;
        
        // 입력
        mid = sc.nextInt();
        fin = sc.nextInt();

        // 출력
        if(mid >= 90){
            if(fin>0 && fin <= 100){
                if(fin >= 95){
                    System.out.println(100000);
                }else if(fin >= 90){
                    System.out.println(50000);
                }else{
                    System.out.println(0);
                }
                }else{
                    System.out.println(0);
                }
            }System.out.println(0);

        }
            
}