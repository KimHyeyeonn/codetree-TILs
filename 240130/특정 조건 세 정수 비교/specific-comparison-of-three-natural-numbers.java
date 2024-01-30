import java.util.Scanner;

// 3개의 정수를 입력 받아 첫 번째 수가 세 정수의 최솟값과 
// 일치한다면 1 아니면 0을 출력하고, 
// 세 개의 수가 모두 같으면 1 아니면 0 을 출력하는 프로그램을 작성해주세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(b>c && a==c){
            System.out.print(1 + " ");
        }
        else if(c>b && a==b){
            System.out.print(1+ " ");
        }
        else {
            System.out.print(0+ " ");
        }

        if (a == b && b == c) {
            System.out.print(1+ " ");
        }
        else {
            System.out.print(0+ " ");
        }
    }
}