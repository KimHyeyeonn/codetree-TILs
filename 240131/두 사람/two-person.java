import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        int age1 = sc.nextInt();
        String fm1 = sc.next();

        int age2 = sc.nextInt();
        String fm2 = sc.next();

        if((fm1.equals("M") && age1 >= 19) || (age2>=19 && fm2.equals("M"))) {
            System.out.println(1);
        }else if(fm1.equals("M") && fm2.equals("M")){
            System.out.print(age1 < 19 || age2 < 19 ? 0 : 1);
        }else{
            System.out.println(0);
        }
    }
}