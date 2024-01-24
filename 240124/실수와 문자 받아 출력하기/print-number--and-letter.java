import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        String resultA = String.format("%.2f", a);
		String resultB = String.format("%.2f", b);

        System.out.println(c);
        System.out.println(resultA);
        System.out.println(resultB);
    }
}