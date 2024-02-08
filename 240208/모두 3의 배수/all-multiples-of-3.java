import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean satisfied = false;
        for (int i = 1; i <= 5; i++) {
             int a = sc.nextInt();
             if(a%3 == 0){
                satisfied = true ;
             }
        }
        if (satisfied == true) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}