import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int sumval = 0;

        for (int i = a; i <= b; i++) {
            sumval += i ;
        }
        System.out.println(sumval);
    }
}