import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= n+3; i += 2) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}