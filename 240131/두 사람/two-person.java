import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        int age1 = sc.nextInt();
        String fm1 = sc.next();

        int age2 = sc.nextInt();
        String fm2 = sc.next();

        if(fm1.equals("M") || fm2.equals("M")) {
            System.out.print(age1 >= 19 || age2 >= 19 ? 1 : 0);
        }else{
            System.out.println(0);
        }
    }
}